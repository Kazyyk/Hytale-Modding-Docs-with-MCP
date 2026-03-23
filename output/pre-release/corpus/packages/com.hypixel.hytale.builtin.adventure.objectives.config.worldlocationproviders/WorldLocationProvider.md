# WorldLocationProvider

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.worldlocationproviders

public abstract class WorldLocationProvider

## Fields

- @Nonnull public static final CodecMapCodec<WorldLocationProvider> CODEC
- @Nonnull public static final BuilderCodec<WorldLocationProvider> BASE_CODEC

## Methods

- @Nullable public abstract Vector3i runCondition(@Nonnull World var1, @Nonnull Vector3i var2)
- @Override public abstract boolean equals(Object var1)
- @Override public abstract int hashCode()
- @Nonnull @Override public String toString()

Known subclasses: CheckTagWorldHeightRadiusProvider, LocationRadiusProvider, LookBlocksBelowProvider

Also in this package: CheckTagWorldHeightRadiusProvider, LocationRadiusProvider, LookBlocksBelowProvider

Complete API:
  public abstract Vector3i runCondition(World var1, Vector3i var2)
  public abstract boolean equals(Object var1)
  public abstract int hashCode()
  public String toString()

Fields:
public static final CodecMapCodec<WorldLocationProvider> CODEC
public static final BuilderCodec<WorldLocationProvider> BASE_CODEC
