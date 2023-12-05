## Loading the dataset

Firstly we have to load the dataset from Github from the available
project repository:

``` r
dataset <- read.csv("https://raw.githubusercontent.com/herminiogg/dmaog-paper-evaluation/master/StatisticalAnalysis/dmaogEvaluationDataset.csv")[, 2:4]
```

## Descriptive statistics

We obtain the descriptive statistics for each of the tools that we have
tested. We include in this analysis the mean, the median, the standard
deviation the minimum and the maximum:

``` r
stby(dataset, dataset$Software, descr, round.digits=5, stats=c("mean", "med", "sd", "min", "max"))
```

    ## Non-numerical variable(s) ignored: Software

    ## Descriptive Statistics  
    ## dataset  
    ## Group: Software = DMAOG  
    ## N: 30  
    ## 
    ##                 All_items   Search_by_fields
    ## ------------- ----------- ------------------
    ##          Mean   286.37433           40.32700
    ##        Median   295.98500           40.26500
    ##       Std.Dev    32.84225            3.24248
    ##           Min   191.53000           34.77000
    ##           Max   319.83000           45.89000
    ## 
    ## Group: Software = LDflex  
    ## N: 30  
    ## 
    ##                    All_items   Search_by_fields
    ## ------------- -------------- ------------------
    ##          Mean   330439.20000        78588.40000
    ##        Median   264983.50000        78572.00000
    ##       Std.Dev   100614.20413         3849.31820
    ##           Min   237190.00000        71486.00000
    ##           Max   491882.00000        91023.00000
    ## 
    ## Group: Software = LDkit  
    ## N: 30  
    ## 
    ##                 All_items   Search_by_fields
    ## ------------- ----------- ------------------
    ##          Mean   328.36167          326.38633
    ##        Median   288.18000          303.30000
    ##       Std.Dev    78.95476           88.84282
    ##           Min   269.86000          240.12000
    ##           Max   486.50000          496.74000
    ## 
    ## Group: Software = LDO  
    ## N: 30  
    ## 
    ##                   All_items   Search_by_fields
    ## ------------- ------------- ------------------
    ##          Mean   10691.00667        10855.62000
    ##        Median    9323.75000        10031.50000
    ##       Std.Dev    2654.65321         2524.43007
    ##           Min    7973.10000         7398.80000
    ##           Max   15519.10000        14454.90000
    ## 
    ## Group: Software = RDF4J-Beans  
    ## N: 30  
    ## 
    ##                    All_items   Search_by_fields
    ## ------------- -------------- ------------------
    ##          Mean   130250.46667       122011.90000
    ##        Median   107894.50000       103271.50000
    ##       Std.Dev    41574.46506        36393.75126
    ##           Min    94509.00000        95807.00000
    ##           Max   196460.00000       197449.00000
    ## 
    ## Group: Software = Walder  
    ## N: 30  
    ## 
    ##                  All_items   Search_by_fields
    ## ------------- ------------ ------------------
    ##          Mean   1288.61333            7.91860
    ##        Median   1282.00000            8.20150
    ##       Std.Dev     36.31465            0.98018
    ##           Min   1236.90000            5.42300
    ##           Max   1409.40000            8.95600

## Testing normality

In order to see if we can apply a One-Way ANOVA over the results we must
ensure firstly that each of the data series are following a normal
distribution. For this we will test again for each of the series that is
combination of the tool and the tested method.

Results for “All items” methods:

``` r
by(dataset$All_items, dataset$Software, shapiro.test)
```

    ## dataset$Software: DMAOG
    ## 
    ##  Shapiro-Wilk normality test
    ## 
    ## data:  dd[x, ]
    ## W = 0.7735, p-value = 2.236e-05
    ## 
    ## ------------------------------------------------------------ 
    ## dataset$Software: LDflex
    ## 
    ##  Shapiro-Wilk normality test
    ## 
    ## data:  dd[x, ]
    ## W = 0.76975, p-value = 1.931e-05
    ## 
    ## ------------------------------------------------------------ 
    ## dataset$Software: LDkit
    ## 
    ##  Shapiro-Wilk normality test
    ## 
    ## data:  dd[x, ]
    ## W = 0.71509, p-value = 2.606e-06
    ## 
    ## ------------------------------------------------------------ 
    ## dataset$Software: LDO
    ## 
    ##  Shapiro-Wilk normality test
    ## 
    ## data:  dd[x, ]
    ## W = 0.78716, p-value = 3.859e-05
    ## 
    ## ------------------------------------------------------------ 
    ## dataset$Software: RDF4J-Beans
    ## 
    ##  Shapiro-Wilk normality test
    ## 
    ## data:  dd[x, ]
    ## W = 0.73109, p-value = 4.572e-06
    ## 
    ## ------------------------------------------------------------ 
    ## dataset$Software: Walder
    ## 
    ##  Shapiro-Wilk normality test
    ## 
    ## data:  dd[x, ]
    ## W = 0.88507, p-value = 0.003693

Results for “Search by fields” methods:

``` r
by(dataset$Search_by_fields, dataset$Software, shapiro.test)
```

    ## dataset$Software: DMAOG
    ## 
    ##  Shapiro-Wilk normality test
    ## 
    ## data:  dd[x, ]
    ## W = 0.96491, p-value = 0.4107
    ## 
    ## ------------------------------------------------------------ 
    ## dataset$Software: LDflex
    ## 
    ##  Shapiro-Wilk normality test
    ## 
    ## data:  dd[x, ]
    ## W = 0.92549, p-value = 0.03733
    ## 
    ## ------------------------------------------------------------ 
    ## dataset$Software: LDkit
    ## 
    ##  Shapiro-Wilk normality test
    ## 
    ## data:  dd[x, ]
    ## W = 0.80722, p-value = 8.902e-05
    ## 
    ## ------------------------------------------------------------ 
    ## dataset$Software: LDO
    ## 
    ##  Shapiro-Wilk normality test
    ## 
    ## data:  dd[x, ]
    ## W = 0.86527, p-value = 0.001317
    ## 
    ## ------------------------------------------------------------ 
    ## dataset$Software: RDF4J-Beans
    ## 
    ##  Shapiro-Wilk normality test
    ## 
    ## data:  dd[x, ]
    ## W = 0.64269, p-value = 2.528e-07
    ## 
    ## ------------------------------------------------------------ 
    ## dataset$Software: Walder
    ## 
    ##  Shapiro-Wilk normality test
    ## 
    ## data:  dd[x, ]
    ## W = 0.75809, p-value = 1.234e-05

Looking to the results we can see that the the null hypothesis (the
sample is following a normal distribution) is rejected in most of the
cases, meaning that they those samples are not following a normal
distribution and thereby we cannot apply a One-Way ANOVA to them as this
is one of the assumptions of this test.

## Testing for differences of means

After the obtained results on normality distribution we can opt for a
non-parametric test for difference of means. In this case we will use
the Kruskal-Wallis test in which the null hypothesis assumes that the
distributions have no differences.

Results for “All items” method:

``` r
kruskal.test(All_items ~ Software, data = dataset)
```

    ## 
    ##  Kruskal-Wallis rank sum test
    ## 
    ## data:  All_items by Software
    ## Kruskal-Wallis chi-squared = 169.11, df = 5, p-value < 2.2e-16

Results for “Search by fields” method:

``` r
kruskal.test(Search_by_fields ~ Software, data = dataset)
```

    ## 
    ##  Kruskal-Wallis rank sum test
    ## 
    ## data:  Search_by_fields by Software
    ## Kruskal-Wallis chi-squared = 174.03, df = 5, p-value < 2.2e-16

In the light of these results we can see that in both cases the null
hypothesis is rejected and the significance of this difference can be
classified as statistically highly significant with the significance
level p \< 0.001.

## Testing differences between groups

The Kruskal-Wallis tests tells us that there are differences between the
four given distributions, however with it we cannot exactly know between
which groups are those differences. For this purpouse we need to run a
post hoc analysis. In this case we will use the Dunn’s Test using the
Benjamini-Hochberg procedure.

Results for “All items” method:

``` r
dunnTest(All_items ~ Software, data = dataset, method = "bh")
```

    ## Warning: Software was coerced to a factor.

    ## Dunn (1964) Kruskal-Wallis multiple comparison

    ##   p-values adjusted with the Benjamini-Hochberg method.

    ##              Comparison           Z      P.unadj        P.adj
    ## 1        DMAOG - LDflex -10.1410150 3.633048e-24 5.449572e-23
    ## 2         DMAOG - LDkit  -0.2130778 8.312663e-01 8.312663e-01
    ## 3        LDflex - LDkit   9.9279373 3.146981e-23 2.360236e-22
    ## 4           DMAOG - LDO  -5.6812478 1.337155e-08 3.342889e-08
    ## 5          LDflex - LDO   4.4597672 8.204874e-06 1.367479e-05
    ## 6           LDkit - LDO  -5.4681701 4.547055e-08 9.743688e-08
    ## 7   DMAOG - RDF4J-Beans  -7.9111314 2.550601e-15 1.275300e-14
    ## 8  LDflex - RDF4J-Beans   2.2298836 2.575517e-02 2.759483e-02
    ## 9   LDkit - RDF4J-Beans  -7.6980537 1.381543e-14 5.180788e-14
    ## 10    LDO - RDF4J-Beans  -2.2298836 2.575517e-02 2.971751e-02
    ## 11       DMAOG - Walder  -3.4513643 5.577602e-04 8.366404e-04
    ## 12      LDflex - Walder   6.6896508 2.237038e-11 6.711115e-11
    ## 13       LDkit - Walder  -3.2382865 1.202500e-03 1.639773e-03
    ## 14         LDO - Walder   2.2298836 2.575517e-02 3.219397e-02
    ## 15 RDF4J-Beans - Walder   4.4597672 8.204874e-06 1.538414e-05

In the case of the “All items” method we can see that there are very
significant differences (p \< 0.001) between:

-   DMAOG and LDflex
-   DMAOG and RDF4J-Beans
-   DMAOG and Walder
-   LDflex and LDkit
-   LDkit and RDF4J-Beans
-   LDflex and Walder
-   RDF4J-Beans and Walder
-   DMAOG and LDO
-   LDflex and LDO
-   LDkit and LDO

There are also significant differences (p \< 0.05) between:

-   LDflex and RDF4J-Beans
-   LDKit and Walder
-   LDO and RDF4J-Beans
-   LDO and Walder

Interestingly, there are no significant differences between DMAOG and
LDkit.

In addition we can calculate the effect size to see how strong is the
seen relation:

    ## Registered S3 methods overwritten by 'car':
    ##   method       from
    ##   hist.boot    FSA 
    ##   confint.boot FSA

    ## 
    ## Attaching package: 'rstatix'

    ## The following object is masked from 'package:stats':
    ## 
    ##     filter

``` r
d_all_items <- dunn_test(All_items ~ Software, data = dataset, p.adjust.method = "BH")
d_all_items$r <- d_all_items$statistic / sqrt(d_all_items$n1+d_all_items$n2)
d_all_items[, c(1,2,3,10)]
```

    ## # A tibble: 15 × 4
    ##    .y.       group1      group2            r
    ##    <chr>     <chr>       <chr>         <dbl>
    ##  1 All_items DMAOG       LDflex       1.31  
    ##  2 All_items DMAOG       LDkit        0.0275
    ##  3 All_items DMAOG       LDO          0.733 
    ##  4 All_items DMAOG       RDF4J-Beans  1.02  
    ##  5 All_items DMAOG       Walder       0.446 
    ##  6 All_items LDflex      LDkit       -1.28  
    ##  7 All_items LDflex      LDO         -0.576 
    ##  8 All_items LDflex      RDF4J-Beans -0.288 
    ##  9 All_items LDflex      Walder      -0.864 
    ## 10 All_items LDkit       LDO          0.706 
    ## 11 All_items LDkit       RDF4J-Beans  0.994 
    ## 12 All_items LDkit       Walder       0.418 
    ## 13 All_items LDO         RDF4J-Beans  0.288 
    ## 14 All_items LDO         Walder      -0.288 
    ## 15 All_items RDF4J-Beans Walder      -0.576

As we can see from the previous results the effect size is large (r \>
0.5) as per Cohen suggested values of effect size for r. Therefore, we
can ensure that:

-   DMAOG is faster than LDflex, RDF4J-Beans and LDO
-   LDkit is faster than LDflex and RDF4J-Beans and LDO
-   LDO is faster than LDflex

However, we cannot ensure with the same certainty, due to medium (r \<=
0.5 and r \> 0.3) or small effect size (r \<= 0.3), that:

-   Walder is faster than RDF4J-Beans and LDO
-   RDF4J-Beans is faster than LDflex
-   DMAOG and LDKit are faster than Walder
-   LDO is faster than RDF4J-Beans

Results for “Search by fields” method:

``` r
dunnTest(Search_by_fields ~ Software, data = dataset, method = "bh")
```

    ## Warning: Software was coerced to a factor.

    ## Dunn (1964) Kruskal-Wallis multiple comparison

    ##   p-values adjusted with the Benjamini-Hochberg method.

    ##              Comparison         Z      P.unadj        P.adj
    ## 1        DMAOG - LDflex -6.689651 2.237038e-11 5.592596e-11
    ## 2         DMAOG - LDkit -2.229884 2.575517e-02 2.575517e-02
    ## 3        LDflex - LDkit  4.459767 8.204874e-06 1.230731e-05
    ## 4           DMAOG - LDO -4.459767 8.204874e-06 1.367479e-05
    ## 5          LDflex - LDO  2.229884 2.575517e-02 2.759483e-02
    ## 6           LDkit - LDO -2.229884 2.575517e-02 2.971751e-02
    ## 7   DMAOG - RDF4J-Beans -8.919534 4.682529e-19 2.341264e-18
    ## 8  LDflex - RDF4J-Beans -2.229884 2.575517e-02 3.219397e-02
    ## 9   LDkit - RDF4J-Beans -6.689651 2.237038e-11 6.711115e-11
    ## 10    LDO - RDF4J-Beans -4.459767 8.204874e-06 1.538414e-05
    ## 11       DMAOG - Walder  2.229884 2.575517e-02 3.512069e-02
    ## 12      LDflex - Walder  8.919534 4.682529e-19 3.511896e-18
    ## 13       LDkit - Walder  4.459767 8.204874e-06 1.758187e-05
    ## 14         LDO - Walder  6.689651 2.237038e-11 8.388893e-11
    ## 15 RDF4J-Beans - Walder 11.149418 7.207630e-29 1.081145e-27

In this case there are very significant differences (p \< 0.001)
between:

-   DMAOG and LDflex
-   DMAOG and RDF4J-Beans
-   LDkit and RDF4J-Beans
-   RDF4J-Beans and Walder
-   LDflex and Walder
-   LDkit and Walder
-   LDflex and LDkit
-   LDO and Walder
-   LDO and RDF4J-Beans
-   DMAOG and LDO

There are significant differences (p \< 0.05) between:

-   DMAOG and LDkit
-   LDkit and LDO
-   LDflex and RDF4J-Beans
-   DMAOG and Walder
-   LDflex and LDO

Calculating the effect size:

``` r
d_search_by_fields <- dunn_test(Search_by_fields ~ Software, data = dataset, p.adjust.method = "BH")
d_search_by_fields$r <- d_search_by_fields$statistic / sqrt(d_search_by_fields$n1+d_search_by_fields$n2)
d_search_by_fields[, c(1,2,3,10)]
```

    ## # A tibble: 15 × 4
    ##    .y.              group1      group2           r
    ##    <chr>            <chr>       <chr>        <dbl>
    ##  1 Search_by_fields DMAOG       LDflex       0.864
    ##  2 Search_by_fields DMAOG       LDkit        0.288
    ##  3 Search_by_fields DMAOG       LDO          0.576
    ##  4 Search_by_fields DMAOG       RDF4J-Beans  1.15 
    ##  5 Search_by_fields DMAOG       Walder      -0.288
    ##  6 Search_by_fields LDflex      LDkit       -0.576
    ##  7 Search_by_fields LDflex      LDO         -0.288
    ##  8 Search_by_fields LDflex      RDF4J-Beans  0.288
    ##  9 Search_by_fields LDflex      Walder      -1.15 
    ## 10 Search_by_fields LDkit       LDO          0.288
    ## 11 Search_by_fields LDkit       RDF4J-Beans  0.864
    ## 12 Search_by_fields LDkit       Walder      -0.576
    ## 13 Search_by_fields LDO         RDF4J-Beans  0.576
    ## 14 Search_by_fields LDO         Walder      -0.864
    ## 15 Search_by_fields RDF4J-Beans Walder      -1.44

We can see that pairing the previously obtained significance values
there are large effect sizes (r \> 0.5) between:

-   DMAOG and LDflex (being DMAOG faster)
-   DMAOG and RDF4J-Beans (DMAOG is faster)
-   RDF4J-Beans and Walder (Walder is faster)
-   LDflex and Walder (Walder is faster)
-   LDkit and RDF4J-Beans (LDkit is faster)
-   LDkit and Walder (Walder is faster)
-   LDflex and LDkit (LDkit is faster)
-   DMAOG and LDO (DMAOG is faster)
-   LDO and RDF4J-Beans (LDO is faster)
-   LDO and Walder (walder is faster)

We see low effect size effects (r \<= 0.3) between:

-   LDflex and RDF4J-Beans (being LDflex faster)
-   DMAOG and Walder (being in this case Walder faster).
-   DMAOG and LDkit (DMAOG is faster)
-   LDflex and LDO (LDO is faster)
-   LDkit and LDO (LDkit is faster)

So we can corroborate that the previously observed differences and
performance classification are statistically valid, so we can classify
their performance depending on the used method:

All items: DMAOG/LDkit \> Walder \> LDO \> RDF4J-Beans \> LDflex Search
by fields: Walder \> DMAOG \> LDkit \> LDO \> LDflex \> RDF4J-Beans

# Visualising the differences

We then can visualise these differences in a box plot where the
differences can be become more evident. For that we are going to analyse
the tools that interchange their position in best performance between
the two tested methods:

RDF4J-Beans and LDflex:

``` r
boxplot(
  filter(dataset, Software == "RDF4J-Beans")$All_items, 
  filter(dataset, Software == "LDflex")$All_items, 
  names=c("RDF4J-Beans - All items", "LDflex - All items"),
  notch=TRUE,
  col=c("yellow", "orange"))
```

    ## Warning in (function (z, notch = FALSE, width = NULL, varwidth = FALSE, : some
    ## notches went outside hinges ('box'): maybe set notch=FALSE

![](analysisInR_files/figure-markdown_github/unnamed-chunk-12-1.png)

``` r
boxplot(
  filter(dataset, Software == "RDF4J-Beans")$Search_by_fields, 
  filter(dataset, Software == "LDflex")$Search_by_fields,
  names=c("RDF4J-Beans - Search by field", "LDflex - Search by field"),
  notch=TRUE,
  col=c("yellow", "orange"))
```

    ## Warning in (function (z, notch = FALSE, width = NULL, varwidth = FALSE, : some
    ## notches went outside hinges ('box'): maybe set notch=FALSE

![](analysisInR_files/figure-markdown_github/unnamed-chunk-13-1.png)

DMAOG, Walder and LDkit:

``` r
boxplot(
  filter(dataset, Software == "DMAOG")$All_items, 
  filter(dataset, Software == "Walder")$All_items, 
  filter(dataset, Software == "LDkit")$All_items, 
  names=c("DMAOG - All items", "Walder - All items", "LDkit - All items"),
  notch=TRUE,
  col=c("red", "purple", "blue"))
```

    ## Warning in (function (z, notch = FALSE, width = NULL, varwidth = FALSE, : some
    ## notches went outside hinges ('box'): maybe set notch=FALSE

![](analysisInR_files/figure-markdown_github/unnamed-chunk-14-1.png)

``` r
boxplot(
  filter(dataset, Software == "DMAOG")$Search_by_fields, 
  filter(dataset, Software == "Walder")$Search_by_fields,
  names=c("DMAOG - Search by field", "Walder - Search by field"),
  notch=TRUE,
  col=c("red", "purple"))
```

![](analysisInR_files/figure-markdown_github/unnamed-chunk-15-1.png)

It is also interesting to plot the differences between DMAOG and LDkit
in the “All items” method as just analysing the mean can deliver to
erroneous conclusions. As we can see in the plot both distributions
notches overlap which suggest that the are no significant differences
between both distributions.

``` r
boxplot(
  filter(dataset, Software == "DMAOG")$All_items, 
  filter(dataset, Software == "LDkit")$All_items, 
  names=c("DMAOG - All items", "LDkit - All items"),
  notch=TRUE,
  col=c("red", "blue"))
```

    ## Warning in (function (z, notch = FALSE, width = NULL, varwidth = FALSE, : some
    ## notches went outside hinges ('box'): maybe set notch=FALSE

![](analysisInR_files/figure-markdown_github/unnamed-chunk-16-1.png)
