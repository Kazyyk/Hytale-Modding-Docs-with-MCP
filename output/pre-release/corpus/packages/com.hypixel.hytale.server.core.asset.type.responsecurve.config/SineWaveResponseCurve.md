# SineWaveResponseCurve

Type: class | Package: com.hypixel.hytale.server.core.asset.type.responsecurve.config | Extends: ResponseCurve

public class SineWaveResponseCurve extends ResponseCurve

## Fields

- public static final BuilderCodec<SineWaveResponseCurve> CODEC
- protected double amplitude
- protected double frequency
- protected double horizontalShift
- protected double verticalShift

## Constructors

- protected SineWaveResponseCurve()

## Methods

- @Override public double computeY(double x)
- public double getAmplitude()
- public double getFrequency()
- public double getHorizontalShift()
- public double getVerticalShift()
- @Nonnull @Override public String toString()

Also in this package: ExponentialResponseCurve, LogisticResponseCurve, Reference, ResponseCurve, SwitchResponseCurve

Complete API:
  public double computeY(double x)
  public double getAmplitude()
  public double getFrequency()
  public double getHorizontalShift()
  public double getVerticalShift()
  public String toString()

Fields:
public static final BuilderCodec<SineWaveResponseCurve> CODEC
protected double amplitude
protected double frequency
protected double horizontalShift
protected double verticalShift
