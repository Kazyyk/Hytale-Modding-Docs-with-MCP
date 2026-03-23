# ResolvedBlockArrayJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.util | Extends: JsonLoader

public class ResolvedBlockArrayJsonLoader extends JsonLoader<SeedStringResource, ResolvedBlockArray>

JSON loader that deserializes configuration data from JSON files.

## Methods

- public ResolvedBlockArray load()
- throw new IllegalArgumentException("Unknown key! " + key)
- throw new IllegalArgumentException("BlockLayer " + blockName + " does not exist in BlockTypes", var13)
- return new ResolvedBlockArray(blocks)
- @Nonnull public ResolvedBlockArray loadSingleBlock(@Nonnull String blockName)
- throw new IllegalArgumentException("BlockLayer does not exist in BlockTypes", var8)
- @Nonnull public static ResolvedBlockArray loadSingleBlock(@Nonnull JsonObject obj)
- throw new IllegalArgumentException("BlockLayer does not exist in BlockTypes", var9)

Also in this package: ColorUtil, Constants, Constants, Constants, EntryJsonLoader, FileMaskCache, NoiseBlockArrayJsonLoader, ResolvedVariantsBlockArrayLoader, Vector2dJsonLoader, Vector3dJsonLoader

Complete API:
  public ResolvedBlockArray load()
  public ResolvedBlockArray loadSingleBlock(String blockName)
  public static ResolvedBlockArray loadSingleBlock(JsonObject obj)
