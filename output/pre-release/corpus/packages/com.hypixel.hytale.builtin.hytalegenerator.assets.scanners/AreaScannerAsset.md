# AreaScannerAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.scanners | Extends: ScannerAsset

public class AreaScannerAsset extends ScannerAsset

## Fields

- @Nonnull public static final BuilderCodec<AreaScannerAsset> CODEC
- private int resultCap
- private AreaScanner.ScanShape scanShape
- private int scanRange
- private ScannerAsset childScannerAsset

## Methods

- @Nonnull @Override public Scanner build(@Nonnull ScannerAsset.Argument argument)
- @Override public void cleanUp()

Also in this package: Argument, ColumnLinearScannerAsset, ColumnRandomScannerAsset, DirectScannerAsset, ImportedScannerAsset, LinearScannerAsset, QueueScannerAsset, RadialScannerAsset, RandomScannerAsset, ScannerAsset

Complete API:
  public Scanner build(ScannerAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<AreaScannerAsset> CODEC
private int resultCap
private AreaScanner.ScanShape scanShape
private int scanRange
private ScannerAsset childScannerAsset
