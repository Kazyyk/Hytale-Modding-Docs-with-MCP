# ScanResult

Type: interface | Package: com.hypixel.hytale.builtin.hytalegenerator.props.deprecated

public interface ScanResult

Interface for scan results returned by the deprecated scan-then-place pipeline. Has a single method `isNegative()` indicating whether the scan found nothing. This type is deprecated.

## Methods


boolean isNegative()

Known implementors: FillerPropScanResult, PickedScanResult, PositionListScanResult, PositionScanResult, RotatedPositionsScanResult

Also in this package: BoxProp, ClusterProp, ColumnProp, DensityProp, PositionListScanResult, PositionScanResult

Complete API:
  boolean isNegative()
  static ScanResult noScanResult()

Fields:
ScanResult NONE
