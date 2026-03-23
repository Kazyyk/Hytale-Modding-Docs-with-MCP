# WorldLocationCondition

Type: abstract class | Package: com.hypixel.hytale.server.core.universe.world.worldlocationcondition

public abstract class WorldLocationCondition

Abstract base type in the WorldLocationCondition hierarchy.

## Methods

- test(World var1, int var2, int var3, int var4) | abstract boolean | Instance method.

Known subclasses: NeighbourBlockTagsLocationCondition

Complete API:
  public abstract boolean test(World var1, int var2, int var3, int var4)
  public abstract boolean equals(Object var1)
  public abstract int hashCode()
  public String toString()

Fields:
public static final CodecMapCodec<WorldLocationCondition> CODEC
public static final BuilderCodec<WorldLocationCondition> BASE_CODEC
