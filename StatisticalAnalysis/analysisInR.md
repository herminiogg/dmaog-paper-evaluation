## Loading the dataset

Firstly we have to load the dataset from Github from the available
project repository:

``` r
dataset <- read.csv("https://raw.githubusercontent.com/herminiogg/dmaog-paper-evaluation/master/StatisticalAnalysis/dmaogEvaluationDataset.csv")[, 2:4]
```

## Descriptive statistics

We obtain the descriptive statistics for each of the tools that we have
tested. We include in this analysis the mean, the standard deviation the
minimum and the maximum:

``` r
stby(dataset, dataset$Software, descr, round.digits=5, stats=c("mean", "sd", "min", "max"))
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
    ##       Std.Dev    32.84225            3.24248
    ##           Min   191.53000           34.77000
    ##           Max   319.83000           45.89000
    ## 
    ## Group: Software = LD-flex  
    ## N: 30  
    ## 
    ##                    All_items   Search_by_fields
    ## ------------- -------------- ------------------
    ##          Mean   330439.20000        78588.40000
    ##       Std.Dev   100614.20413         3849.31820
    ##           Min   237190.00000        71486.00000
    ##           Max   491882.00000        91023.00000
    ## 
    ## Group: Software = RDF4J-Beans  
    ## N: 30  
    ## 
    ##                    All_items   Search_by_fields
    ## ------------- -------------- ------------------
    ##          Mean   130250.46667       122011.90000
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
    ## dataset$Software: LD-flex
    ## 
    ##  Shapiro-Wilk normality test
    ## 
    ## data:  dd[x, ]
    ## W = 0.76975, p-value = 1.931e-05
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
    ## dataset$Software: LD-flex
    ## 
    ##  Shapiro-Wilk normality test
    ## 
    ## data:  dd[x, ]
    ## W = 0.92549, p-value = 0.03733
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
    ## Kruskal-Wallis chi-squared = 111.57, df = 3, p-value < 2.2e-16

Results for “Search by fields” method:

``` r
kruskal.test(Search_by_fields ~ Software, data = dataset)
```

    ## 
    ##  Kruskal-Wallis rank sum test
    ## 
    ## data:  Search_by_fields by Software
    ## Kruskal-Wallis chi-squared = 111.57, df = 3, p-value < 2.2e-16

In the light of these results we can see that in both cases the null
hypothesis is rejected and the significance of this difference can be
classified as statistically highly significant with the significance
level p \< 0.001.

In addition, we can measure the strength of this difference by measuring
the effect size:

TODO

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

    ##              Comparison          Z      P.unadj        P.adj
    ## 1       DMAOG - LD-flex -10.020657 1.236777e-23 7.420663e-23
    ## 2   DMAOG - RDF4J-Beans  -6.680438 2.382289e-11 4.764578e-11
    ## 3 LD-flex - RDF4J-Beans   3.340219 8.371232e-04 8.371232e-04
    ## 4        DMAOG - Walder  -3.340219 8.371232e-04 1.004548e-03
    ## 5      LD-flex - Walder   6.680438 2.382289e-11 7.146866e-11
    ## 6  RDF4J-Beans - Walder   3.340219 8.371232e-04 1.255685e-03

In the case of the “All items” method we can see that there are very
significant differences (p \< 0.001) between DMAOG and LD-Flex, between
DMAOG and RDF4J-Beans, between LD-flex and RDF4J-Beans, and between
LD-flex and Walder. Also there are significant differences (p \< 0.05)
between RDF4J-Beans and Walder and between DMAOG and Walder. In addition
we can calculate the effect size to see how strong is the seen relation:

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

    ## # A tibble: 6 × 4
    ##   .y.       group1      group2           r
    ##   <chr>     <chr>       <chr>        <dbl>
    ## 1 All_items DMAOG       LD-flex      1.29 
    ## 2 All_items DMAOG       RDF4J-Beans  0.862
    ## 3 All_items DMAOG       Walder       0.431
    ## 4 All_items LD-flex     RDF4J-Beans -0.431
    ## 5 All_items LD-flex     Walder      -0.862
    ## 6 All_items RDF4J-Beans Walder      -0.431

As we can see from the previous results the effect size is large as per
Cohen suggested values of effect size for r. Therefore, we can ensure
that DMAOG is faster than LD-flex, and RDF4J-Beans, and Walder is faster
than LD-flex. However, while we can ensure that DMAOG is faster than
Walder, Walder is faster than RDF4J-Beans and RDF4J-Beans is faster than
LD-flex these relations have a medium effect size so the difference is
less strong than in the other cases.

Results for “Search by fields” method:

``` r
dunnTest(Search_by_fields ~ Software, data = dataset, method = "bh")
```

    ## Warning: Software was coerced to a factor.

    ## Dunn (1964) Kruskal-Wallis multiple comparison

    ##   p-values adjusted with the Benjamini-Hochberg method.

    ##              Comparison         Z      P.unadj        P.adj
    ## 1       DMAOG - LD-flex -3.340219 8.371232e-04 8.371232e-04
    ## 2   DMAOG - RDF4J-Beans -6.680438 2.382289e-11 4.764578e-11
    ## 3 LD-flex - RDF4J-Beans -3.340219 8.371232e-04 1.004548e-03
    ## 4        DMAOG - Walder  3.340219 8.371232e-04 1.255685e-03
    ## 5      LD-flex - Walder  6.680438 2.382289e-11 7.146866e-11
    ## 6  RDF4J-Beans - Walder 10.020657 1.236777e-23 7.420663e-23

In this case there are very significant differences between DMAOG and
RDF4J-Beans, RDF4J-Beans and Walder, between LD-flex and Walder, and
between DMAOG and LD-flex. There are significant differences between
LD-flex and RDF4J-Beans and between DMAOG and Walder. Calculating the
effect size:

``` r
d_search_by_fields <- dunn_test(Search_by_fields ~ Software, data = dataset, p.adjust.method = "BH")
d_search_by_fields$r <- d_search_by_fields$statistic / sqrt(d_search_by_fields$n1+d_search_by_fields$n2)
d_search_by_fields[, c(1,2,3,10)]
```

    ## # A tibble: 6 × 4
    ##   .y.              group1      group2           r
    ##   <chr>            <chr>       <chr>        <dbl>
    ## 1 Search_by_fields DMAOG       LD-flex      0.431
    ## 2 Search_by_fields DMAOG       RDF4J-Beans  0.862
    ## 3 Search_by_fields DMAOG       Walder      -0.431
    ## 4 Search_by_fields LD-flex     RDF4J-Beans  0.431
    ## 5 Search_by_fields LD-flex     Walder      -0.862
    ## 6 Search_by_fields RDF4J-Beans Walder      -1.29

We can see that pairing the previously obtained significance values
there are large effect sizes between DMAOG and RDF4J-Beans (DMAOG is
faster), between RDF4J-Beans and Walder (Walder is faster) and between
LD-flex and Walder (Walder is faster). We see medium size effects
between DMAOG and LD-flex (being DMAOG faster) between LD-flex and
RDF4J-Beans (being LD-flex faster), and between DMAOG and Walder (being
in this case Walder faster).

So we can corroborate that the previously observed differences and
performance classification are statistically valid, so we can classify
their performance depending on the used method:

All items: DMAOG, Walder, RDF4J-Beans, LD-flex Search by fields: Walder,
DMAOG, LD-flex and RDF4J-Beans

# Visualising the differences

We then can visualise these differences in a box plot where the
differences can be become more evident. For that we are going to analyse
the tools that interchange their position in best performance between
the two tested methods:

RDF4J-Beans and LD-flex:

``` r
boxplot(
  filter(dataset, Software == "RDF4J-Beans")$All_items, 
  filter(dataset, Software == "LD-flex")$All_items, 
  names=c("RDF4J-Beans - All items", "LD-flex - All items"),
  notch=TRUE,
  col=c("yellow", "orange"))
```

    ## Warning in (function (z, notch = FALSE, width = NULL, varwidth = FALSE, : some
    ## notches went outside hinges ('box'): maybe set notch=FALSE

![](analysisInR_files/figure-markdown_github/unnamed-chunk-12-1.png)

``` r
boxplot(
  filter(dataset, Software == "RDF4J-Beans")$Search_by_fields, 
  filter(dataset, Software == "LD-flex")$Search_by_fields,
  names=c("RDF4J-Beans - Search by field", "LD-flex - Search by field"),
  notch=TRUE,
  col=c("yellow", "orange"))
```

    ## Warning in (function (z, notch = FALSE, width = NULL, varwidth = FALSE, : some
    ## notches went outside hinges ('box'): maybe set notch=FALSE

![](analysisInR_files/figure-markdown_github/unnamed-chunk-13-1.png)

DMAOG and Walder:

``` r
boxplot(
  filter(dataset, Software == "DMAOG")$All_items, 
  filter(dataset, Software == "Walder")$All_items, 
  names=c("DMAOG - All items", "Walder - All items"),
  notch=TRUE,
  col=c("red", "purple"))
```

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
