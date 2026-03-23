# ClampCurveAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.curves | Extends: CurveAsset

public class ClampCurveAsset extends CurveAsset

## Fields

- private CurveAsset curveAsset
- private double wallA
- private double wallB

## Methods

- @Override @Nonnull public Double2DoubleFunction build()
- @Override public void cleanUp()

Also in this package: CeilingCurveAsset, ConstantCurveAsset, CurveAsset, DistanceExponentialCurveAsset, DistanceSCurveAsset, FloorCurveAsset, ImportedCurveAsset, InverterCurveAsset, MaxCurveAsset, MinCurveAsset, MultiplierCurveAsset, NotCurveAsset, SmoothCeilingCurveAsset, SmoothClampCurveAsset, SmoothFloorCurveAsset, SmoothMaxCurveAsset, SmoothMinCurveAsset, SumCurveAsset

Complete API:
  public Double2DoubleFunction build()
  public void cleanUp()

Fields:
public static final BuilderCodec<ClampCurveAsset> CODEC
private CurveAsset curveAsset
private double wallA
private double wallB
