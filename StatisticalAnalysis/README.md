# Statistical Analysis
This folder contains the raw data collected from the experiment described in the DMAOG paper, as well as the statistical analysis and the commands used in R for conducting it.

## Raw Data
There are three main files containing the raw data:

* [Evaluation Performance DMAOG (final results).xlsx](Evaluation%20Performance%20DMAOG%20(final%20results).xlsx) - Contains the raw data obtained from the experiment, it contains all the measurements collected without any further processing. The tab "normalised measurements" contains the measures after normalisation using the normalisation coefficient (the number next to the name of the measurement indicating how many times this method was executed to obtain a significative number.)
* [Evaluation Performance DMAOG (final results).ods](Evaluation%20Performance%20DMAOG%20(final%20results).ods) - Same file as the previous one but in the Open Document Spreadsheet format. It is included here to ensure reproducibility when only using open source software.
* [dmaogEvaluationDataset.csv](dmaogEvaluationDataset.csv) - Provides the same data as in the two previous files but arranged as an observations database directly prepared for the statistical analysis in R (or in any other statistical software). This file is the input for the statistical analysis in R described in the next section.

## Statistical analysis in R
The statistical analysis was performed in R and it has been documented using RMarkdown. The source file containing the used commands and the explanation of the whole process is named [analysisInR.Rmd](analysisInR.Rmd). You can see the results of the analysis rendered in Github inspecting the [analysisInR.md](analysisInR.md) file. Or alternatively, you can see the file [analysisInR.html](https://herminiogg.github.io/dmaog-paper-evaluation/analysisInR.html) with the results in your browser.