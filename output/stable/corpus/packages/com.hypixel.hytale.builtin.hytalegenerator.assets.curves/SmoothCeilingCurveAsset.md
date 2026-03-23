# SmoothCeilingCurveAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.curves | Extends: CurveAsset

public class SmoothCeilingCurveAsset extends CurveAsset

## Fields

- private CurveAsset curveAsset
- private double range
- private double limit

## Methods

- @Override @Nonnull public Double2DoubleFunction build()
- @Override public void cleanUp()

Also in this package: CeilingCurveAsset, ClampCurveAsset, ConstantCurveAsset, CurveAsset, DistanceExponentialCurveAsset, DistanceSCurveAsset, FloorCurveAsset, ImportedCurveAsset, InverterCurveAsset, MaxCurveAsset, MinCurveAsset, MultiplierCurveAsset, NotCurveAsset, SmoothClampCurveAsset, SmoothFloorCurveAsset, SmoothMaxCurveAsset, SmoothMinCurveAsset, SumCurveAsset

Complete API:
  public Double2DoubleFunction build()
  public void cleanUp()

Fields:
public static final BuilderCodec<SmoothCeilingCurveAsset> CODEC
private CurveAsset curveAsset
private double range
private double limit
