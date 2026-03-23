# DamageCalculatorSystems.Sequence

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage

public static class DamageCalculatorSystems.Sequence

A codec-serializable hit counter used in damage sequence tracking. Contains a single `hits` field serialized as `"Hits"` in JSON. Wrapped by DamageCalculatorSystems.DamageSequence.

## Static Fields

- CODEC | BuilderCodec<DamageCalculatorSystems.Sequence> | Builder codec for JSON serialization with key `"Hits"`.

## Constructors


public Sequence()

Default constructor; hits defaults to 0.


public Sequence(int hits)

Creates a sequence with the given hit count.

## Methods


public int getHits()

Returns the current hit count.


@Nonnull
@Override
public String toString()

Returns a string representation: `"Sequence{hits=N}"`.

## Related Types

- DamageCalculatorSystems.DamageSequence -- wraps this sequence
- DamageCalculatorSystems -- parent class
