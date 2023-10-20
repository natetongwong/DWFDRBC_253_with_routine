package config

import pureconfig._
import pureconfig.generic.ProductHint
import io.prophecy.libs._

case class Config(
  @Description("Source Directory") SOURCE_DIR: String =
    "/etl/dev/source/text_253/fdr_bnkcrd",
  @Description("Bank Number") BANK_NUM:   String = "100",
  @Description("Date of Data") DATA_DATE: String = "20130430",
  @Description("Target Directory") TARGET_DIR: String =
    "/etl/dev/source/conv_253/fdr_bnkcrd",
  @Description("Current Date time") DATE: String = "1697831592552"
) extends ConfigBase
