# SwitchResponseCurve

Type: class | Package: com.hypixel.hytale.server.core.asset.type.responsecurve.config | Extends: ResponseCurve

public class SwitchResponseCurve extends ResponseCurve

A response curve that returns one value below a switch point and another value at or above it. Produces a step function: `initialState` when `x < switchPoint`, `finalState` when `x >= switchPoint`. All three parameters are clamped to the range [0.0, 1.0].

## Fields

- initialState | double | 0.0 | [0.0, 1.0] | Output value below the switch point
- finalState | double | 1.0 | [0.0, 1.0] | Output value at and above the switch point
- switchPoint | double | 0.0 | [0.0, 1.0] | The x value at which the output switches

## Methods


@Override
public double computeY(double x)

Returns `initialState` if `x < switchPoint`, otherwise returns `finalState`.

## Related Types

- `ResponseCurve` -- abstract base class

Also in this package: ExponentialResponseCurve, LogisticResponseCurve, Reference, ResponseCurve, SineWaveResponseCurve

Complete API:
  public double computeY(double x)
  public String toString()

Fields:
public static final BuilderCodec<SwitchResponseCurve> CODEC
protected double initialState
protected double finalState
protected double switchPoint
