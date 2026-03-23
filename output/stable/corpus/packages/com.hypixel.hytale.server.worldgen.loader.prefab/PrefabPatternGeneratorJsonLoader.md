# PrefabPatternGeneratorJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.prefab | Extends: JsonLoader

public class PrefabPatternGeneratorJsonLoader extends JsonLoader<SeedStringResource, PrefabPatternGenerator>

JSON loader that deserializes configuration data from JSON files.

## Methods

- @Nonnull public PrefabPatternGenerator load()
- @Nullable protected IPointGenerator loadPattern()
- throw new IllegalArgumentException("Could not find point generator to place prefabs at! Keyword: GridGenerator")
- protected PrefabCategory loadCategory()
- @Nonnull protected IBlockFluidCondition loadParent()
- @Nullable protected IHeightThresholdInterpreter loadHeightThresholds()
- @Nonnull protected ICoordinateRndCondition loadHeightCondition(@Nullable IHeightThresholdInterpreter thresholdInterpreter)
- @Nonnull protected ICoordinateCondition loadMapCondition()
- @Nullable protected BlockMaskCondition loadMask()
- @Nullable protected PrefabRotation[] loadRotations()
- @Nonnull protected ICoordinateDoubleSupplier loadDisplacement()
- protected boolean loadFitHeightmap()
- protected boolean loadOnWater()
- protected boolean loadDeepSearch(@Nonnull IHeightThresholdInterpreter interpreter)
- throw new IllegalArgumentException("DeepSearch is enabled but HeightThreshold is not set!")
- protected boolean loadSubmerge()
- protected int loadMaxSize()
- protected int loadExclusionRadius()
- @Nullable public static PrefabRotation[] loadRotations(@Nullable JsonElement element)
- throw new IllegalArgumentException("Array for rotations must be greater than 0 or left away to allow random rotation.")
- throw new IllegalArgumentException("rotations is not an array nor a string, other types are not supported! Given: " + element)
