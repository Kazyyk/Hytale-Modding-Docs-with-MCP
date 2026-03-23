# ScaledXResponseCurve

Type: class | Package: com.hypixel.hytale.server.core.asset.type.responsecurve | Extends: ScaledResponseCurve

public class ScaledXResponseCurve extends ScaledResponseCurve

## Fields

- public static final BuilderCodec<ScaledXResponseCurve> CODEC
- public static final double[] DEFAULT_RANGE
- protected String responseCurve
- protected ResponseCurve.Reference responseCurveReference
- protected double[] xRange

## Methods

- public String getResponseCurve()
- public double[] getXRange()
- @Override public double computeY(double x)
- protected double computeNormalisedY(double x)
- @Nonnull @Override public String toString()

Known subclasses: ScaledXYResponseCurve

Also in this package: ScaledResponseCurve, ScaledSwitchResponseCurve, ScaledXYResponseCurve

Complete API:
  public String getResponseCurve()
  public double[] getXRange()
  public double computeY(double x)
  protected double computeNormalisedY(double x)
  public String toString()

Fields:
public static final BuilderCodec<ScaledXResponseCurve> CODEC
public static final double[] DEFAULT_RANGE
protected String responseCurve
protected ResponseCurve.Reference responseCurveReference
protected double[] xRange
