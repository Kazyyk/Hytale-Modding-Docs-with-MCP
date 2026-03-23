---
title: "EnvironmentContainerJsonLoader"
kind: class
package: "com.hypixel.hytale.server.worldgen.loader.container"
fqcn: "com.hypixel.hytale.server.worldgen.loader.container.EnvironmentContainerJsonLoader"
api_surface: "public"
extends: "JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["worldgen", "loader", "json"]
---

Loads `EnvironmentContainer` definitions from JSON. Handles default environment entries and arrays of noise-conditioned environment entries. Maps environment name strings to integer indices via `Environment.getAssetMap()`.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

| Method | Return Type | Description |
|--------|------------|-------------|
| `load()` | `EnvironmentContainer` | Parses JSON and returns an `EnvironmentContainer` with default and conditional entries. |
| `loadDefault()` | `EnvironmentContainer.DefaultEnvironmentContainerEntry` | Loads the default environment entry from a `Default` key or the root element. |
| `loadEntries()` | `EnvironmentContainer.EnvironmentContainerEntry[]` | Loads the `Entries` array of conditional environment entries. |

## Inner Types

### EnvironmentContainerEntryJsonLoader

*static class*

Inner loader for individual entries. Loads weighted environment ID mappings, value noise, and noise mask conditions.

### DefaultEnvironmentContainerEntryLoader

*static class*

Extends `EnvironmentContainerEntryJsonLoader` to handle default entries with fallback to environment index 0.

### Constants

*interface*

JSON key constants: `Default`, `Entries`, `Names`, `Weights`, `Noise`, `NoiseMask`.

