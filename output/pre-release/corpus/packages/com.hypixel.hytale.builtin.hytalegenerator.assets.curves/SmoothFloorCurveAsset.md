# SmoothFloorCurveAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.curves | Extends: CurveAsset

public class SmoothFloorCurveAsset extends CurveAsset

## Fields

- private CurveAsset curveAsset
- private double range
- private double limit

## Methods

- @Override @Nonnull public Double2DoubleFunction build()
- @Override public void cleanUp()

Also in this package: CeilingCurveAsset, ClampCurveAsset, ConstantCurveAsset, CurveAsset, DistanceExponentialCurveAsset, DistanceSCurveAsset, FloorCurveAsset, ImportedCurveAsset, InverterCurveAsset, MaxCurveAsset, MinCurveAsset, MultiplierCurveAsset, NotCurveAsset, SmoothCeilingCurveAsset, SmoothClampCurveAsset, SmoothMaxCurveAsset, SmoothMinCurveAsset, SumCurveAsset

Complete API:
  public Double2DoubleFunction build()
  public void cleanUp()

Fields:
public static final BuilderCodec<SmoothFloorCurveAsset> CODEC
private CurveAsset curveAsset
private double range
private double limit
