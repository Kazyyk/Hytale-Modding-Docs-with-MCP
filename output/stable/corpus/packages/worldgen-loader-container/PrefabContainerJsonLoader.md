# PrefabContainerJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.container | Extends: JsonLoader

Loads `PrefabContainer` biome prefab placement definitions from JSON. Each entry associates a weighted prefab map with a pattern generator and optional environment override.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

- load() | PrefabContainer | Returns a `PrefabContainer` with all prefab entries.
- loadEntries() | PrefabContainer.PrefabContainerEntry[] | Loads the `Entries` array of prefab container entries.

## Inner Types

### PrefabContainerEntryJsonLoader

*static class*

Loads individual prefab entries with weighted prefab maps, pattern generators, and environment overrides.

### Constants

*interface*

JSON key constants: `Entries`, `Prefab`, `Weight`, `Pattern`, `Environment`.
