# LogisticResponseCurve

Type: class | Package: com.hypixel.hytale.server.core.asset.type.responsecurve.config | Extends: ResponseCurve

public class LogisticResponseCurve extends ResponseCurve

## Fields

- public static final BuilderCodec<LogisticResponseCurve> CODEC
- protected double rateOfChange
- protected double ceiling
- protected double horizontalShift
- protected double verticalShift

## Constructors

- public LogisticResponseCurve(double rateOfChange, double ceiling, double horizontalShift, double verticalShift)
- protected LogisticResponseCurve()

## Methods

- @Override public double computeY(double x)
- public double getRateOfChange()
- public double getCeiling()
- public double getHorizontalShift()
- public double getVerticalShift()
- @Nonnull @Override public String toString()

Also in this package: ExponentialResponseCurve, Reference, ResponseCurve, SineWaveResponseCurve, SwitchResponseCurve

Complete API:
  public double computeY(double x)
  public double getRateOfChange()
  public double getCeiling()
  public double getHorizontalShift()
  public double getVerticalShift()
  public String toString()

Fields:
public static final BuilderCodec<LogisticResponseCurve> CODEC
protected double rateOfChange
protected double ceiling
protected double horizontalShift
protected double verticalShift
