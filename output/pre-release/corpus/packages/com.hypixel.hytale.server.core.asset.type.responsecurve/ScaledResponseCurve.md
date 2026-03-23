# ScaledResponseCurve

Type: class | Package: com.hypixel.hytale.server.core.asset.type.responsecurve | Implements: JsonAssetWithMap

public abstract class ScaledResponseCurve implements JsonAssetWithMap

## Fields

- public static final AssetCodecMapCodec<String,ScaledResponseCurve> CODEC
- protected AssetExtraInfo.Data data
- protected String id

## Methods

- public abstract double computeY(double var1)
- public String getId()
- @Nonnull @Override public String toString()

Known subclasses: ScaledSwitchResponseCurve, ScaledXResponseCurve

Also in this package: ScaledSwitchResponseCurve, ScaledXResponseCurve, ScaledXYResponseCurve

Complete API:
  public abstract double computeY(double var1)
  public String getId()
  public String toString()

Fields:
public static final AssetCodecMapCodec<String,ScaledResponseCurve> CODEC
protected AssetExtraInfo.Data data
protected String id
