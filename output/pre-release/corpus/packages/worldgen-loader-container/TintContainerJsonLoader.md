# TintContainerJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.container | Extends: JsonLoader

Loads `TintContainer` biome tint color definitions from JSON. Supports default tint colors, arrays of noise-conditioned tint entries, and hex color string parsing via `ColorUtil`.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

- load() | TintContainer | Returns a `TintContainer` with default and conditional tint entries.
- loadDefault() | TintContainer.DefaultTintContainerEntry | Loads the default tint entry.
- loadEntries() | List<TintContainer.TintContainerEntry> | Loads the `Entries` list of conditional tint entries.

## Inner Types

### TintContainerEntryJsonLoader

*static class*

Loads individual tint entries with weighted color mappings, value noise, and noise mask conditions.

### DefaultTintContainerEntryJsonLoader

*static class*

Extends `TintContainerEntryJsonLoader` for the default entry. Falls back to red (0xFF0000) when no color is specified.

### Constants

*interface*

JSON key constants: `Default`, `Entries`, `Colors`, `Weights`, `Noise`, `NoiseMask`. Default tint color is 16711680 (0xFF0000).
