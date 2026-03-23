# TickProcedure

Type: abstract class | Package: com.hypixel.hytale.server.core.asset.type.blocktick.config

public abstract class TickProcedure

Abstract base type in the TickProcedure hierarchy.

## Constants

- BASE_RANDOM | SplittableRandom
- RANDOM | ThreadLocal<SplittableRandom>

## Accessors

- getRandom() | SplittableRandom | Accessor method.

## Methods

- onTick(World var1, WorldChunk var2, int var3, int var4, int var5, int var6) | abstract BlockTickStrategy | Instance method.

Known subclasses: BasicChanceBlockGrowthProcedure

Also in this package: RandomTickProcedure

Complete API:
  protected SplittableRandom getRandom()
  public abstract BlockTickStrategy onTick(World var1, WorldChunk var2, int var3, int var4, int var5, int var6)

Fields:
public static final CodecMapCodec<TickProcedure> CODEC
public static final BuilderCodec<TickProcedure> BASE_CODEC
protected static final SplittableRandom BASE_RANDOM
protected static final ThreadLocal<SplittableRandom> RANDOM
