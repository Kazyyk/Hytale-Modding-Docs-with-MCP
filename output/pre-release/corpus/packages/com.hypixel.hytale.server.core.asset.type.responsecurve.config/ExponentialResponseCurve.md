# ExponentialResponseCurve

Type: class | Package: com.hypixel.hytale.server.core.asset.type.responsecurve.config | Extends: ResponseCurve

public class ExponentialResponseCurve extends ResponseCurve

## Fields

- public static final BuilderCodec<ExponentialResponseCurve> CODEC
- protected double slope
- protected double exponent
- protected double horizontalShift
- protected double verticalShift

## Constructors

- public ExponentialResponseCurve(double slope, double exponent, double horizontalShift, double verticalShift)
- public ExponentialResponseCurve(String id)
- protected ExponentialResponseCurve()

## Methods

- @Override public double computeY(double x)
- public double getSlope()
- public double getExponent()
- public double getHorizontalShift()
- public double getVerticalShift()
- @Nonnull @Override public String toString()

Also in this package: LogisticResponseCurve, Reference, ResponseCurve, SineWaveResponseCurve, SwitchResponseCurve

Complete API:
  public double computeY(double x)
  public double getSlope()
  public double getExponent()
  public double getHorizontalShift()
  public double getVerticalShift()
  public String toString()

Fields:
public static final BuilderCodec<ExponentialResponseCurve> CODEC
protected double slope
protected double exponent
protected double horizontalShift
protected double verticalShift
