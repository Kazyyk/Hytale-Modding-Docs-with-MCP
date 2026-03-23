# FillerPropScanResult

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.filler | Implements: ScanResult

public class FillerPropScanResult implements ScanResult

Implementation of `ScanResult`.

## Fields

- positions | List<Vector3i> | List<Vector3i> field.

## Constructors

- FillerPropScanResult(@Nullable List<Vector3i> positions) | Creates a new FillerPropScanResult instance.

## Methods

- getFluidBlocks() | List<Vector3i> | public method.
- cast(ScanResult scanResult) | FillerPropScanResult | static public method.
- isNegative() | boolean | public method.

Also in this package: PondFillerProp

Complete API:
  public List<Vector3i> getFluidBlocks()
  public static FillerPropScanResult cast(ScanResult scanResult)
  public boolean isNegative()

Fields:
private List<Vector3i> positions
