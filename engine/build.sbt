name := "PredictionIO-Churn-Prediction-H2O-Sparkling-Water"

organization := "io.prediction"


libraryDependencies ++= Seq(
  "io.prediction"    %% "core"          % pioVersion.value % "provided",
  "org.apache.spark" %% "spark-core"    % "1.2.0" % "provided",
  "org.apache.spark" %% "spark-mllib"   % "1.2.0" % "provided"
)