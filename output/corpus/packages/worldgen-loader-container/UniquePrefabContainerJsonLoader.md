# UniquePrefabContainerJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.container | Extends: JsonLoader

Loads `UniquePrefabContainer` zone-level unique prefab definitions from JSON. Unique prefabs are named, categorized structures placed once per zone using configuration-driven placement rules.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

- load() | UniquePrefabContainer | Returns a `UniquePrefabContainer` with an array of `UniquePrefabGenerator` instances.

## Inner Types

### UniquePrefabGeneratorJsonLoader

*static class*

Loads individual unique prefab generators with name, category, weighted prefab map, and unique placement configuration.

### Constants

*interface*

JSON key constants: `Entries`, `Config`, `Prefab`, `Weights`, `Name`.
