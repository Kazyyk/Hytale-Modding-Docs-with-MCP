# CaveNodeTypeStorage

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave

public class CaveNodeTypeStorage

Registry for loaded `CaveNodeType` instances during cave JSON loading. Caches loaded types by name and supports lazy loading from `.node.json` files. Prevents duplicate registration of the same name.

## Constructors


public CaveNodeTypeStorage(SeedString<SeedStringResource> seed, Path dataFolder, Path caveFolder, ZoneFileContext zoneContext)

## Instance Methods


public SeedString<SeedStringResource> getSeed()


public void add(String name, CaveNodeType caveNodeType)


public CaveNodeType getOrLoadCaveNodeType(@Nonnull String name)

Returns the cached type or loads it from a `.node.json` file.


public CaveNodeType getCaveNodeType(String name)


public CaveNodeType loadCaveNodeType(@Nonnull String name)


public CaveNodeType loadCaveNodeType(@Nonnull String name, @Nonnull JsonObject json)
