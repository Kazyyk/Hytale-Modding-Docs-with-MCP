# PairCodec

Type: class | Package: com.hypixel.hytale.server.core.codec

public class PairCodec

## Fields

- private Integer left
- private Integer right
- private Integer left
- private String right

## Methods

- @Nonnull public Pair<Integer, Integer> toPair()
- @Nonnull public static PairCodec.IntegerPair fromPair(@Nonnull Pair<Integer, Integer> pair)
- public Integer getLeft()
- public Integer getRight()
- @Nonnull public Pair<Integer, String> toPair()
- @Nonnull public static PairCodec.IntegerStringPair fromPair(@Nonnull Pair<Integer, String> pair)
- public String getRight()

## Inner Types

- `PairCodec.IntegerPair`
- `PairCodec.IntegerStringPair`
