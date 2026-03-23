# LightRangePredicate

Type: class | Package: com.hypixel.hytale.server.spawning.util

public class LightRangePredicate

Predicate that tests whether a world position's light levels fall within configured ranges. Supports six independent light channels: combined light, sky light, sunlight, and RGB block light. Used by the spawning system to enforce light-based spawn conditions.

## Methods

- public static int lightToPrecentage(byte light)
- public void setLightRange(@Nonnull LightType type, double[] lightRange)
- public void setLightRange(@Nullable double[] lightRange)
- public void setSkyLightRange(@Nullable double[] lightRange)
- public void setSunlightRange(@Nullable double[] lightRange)
- public void setRedLightRange(@Nullable double[] lightRange)
- public void setGreenLightRange(@Nullable double[] lightRange)
- public void setBlueLightRange(@Nullable double[] lightRange)
- public boolean test(@Nonnull World world, @Nonnull Vector3d position, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public boolean test(@Nullable BlockChunk blockChunk, int x, int y, int z, double sunlightFactor)
- public static byte calculateLightValue(@Nonnull BlockChunk blockChunk, int x, int y, int z, double sunlightFactor)
