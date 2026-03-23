# NoiseBlockArrayJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.util | Extends: JsonLoader

public class NoiseBlockArrayJsonLoader extends JsonLoader<SeedStringResource, NoiseBlockArray>

JSON loader that deserializes configuration data from JSON files.

## Methods

- @Nonnull public NoiseBlockArray load()
- return new NoiseBlockArray(entries)
- throw new IllegalArgumentException("Could not find entries in block array. Keyword: Entries")
- @Nonnull protected NoiseBlockArray.Entry loadEntry(JsonElement element, int i)
- public EntryJsonLoader(@Nonnull SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json)
- throw new IllegalArgumentException("Unsupported Json Entry: " + this.json)
- @Nullable protected IDoubleRange loadRepetitions()
- @Nullable protected NoiseProperty loadNoise()
- @Nonnull protected BlockFluidEntry resolveBlockId(@Nonnull String name)
- throw new IllegalArgumentException("Unknown key! " + key)
- return new BlockFluidEntry(0, 0, index)
- throw new Error("BlockLayer does not exist in BlockTypes", var4)
