# ISectionPalette

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.palette

public interface ISectionPalette

Interface for chunk section block palettes. Defines the contract for getting/setting block IDs by index, querying contents, counting values, finding blocks, promoting/demoting palette capacity, and serialization for both network packets and disk storage. Provides a static factory `from()` that selects the appropriate implementation based on unique ID count.

## Inner Types

- `ISectionPalette.SetResult` -- enum: `ADDED_OR_REMOVED`, `CHANGED`, `UNCHANGED`, `REQUIRES_PROMOTE`
- `ISectionPalette.KeySerializer` -- functional interface for serializing external IDs
