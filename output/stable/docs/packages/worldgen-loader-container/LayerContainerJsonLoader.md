---
title: "LayerContainerJsonLoader"
kind: class
package: "com.hypixel.hytale.server.worldgen.loader.container"
fqcn: "com.hypixel.hytale.server.worldgen.loader.container.LayerContainerJsonLoader"
api_surface: "public"
extends: "JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["worldgen", "loader", "json"]
---

Loads `LayerContainer` terrain layer definitions from JSON. Supports static layers (fixed Y ranges) and dynamic layers (relative to surface). Each layer contains block arrays, noise masks, and optional environment overrides.

## Hierarchy

- **Extends:** `JsonLoader`

## Methods

| Method | Return Type | Description |
|--------|------------|-------------|
| `load()` | `LayerContainer` | Returns a `LayerContainer` with default block, default environment, static layers, and dynamic layers. |
| `loadDefault()` | `int` | Loads the default filling block type index from the `Default` key. |
| `loadDefaultEnvironment()` | `int` | Loads the optional default environment index from the `Environment` key. |
| `loadStaticLayers()` | `LayerContainer.StaticLayer[]` | Loads the `Static` array of static layer definitions. |
| `loadDynamicLayers()` | `LayerContainer.DynamicLayer[]` | Loads the `Dynamic` array of dynamic layer definitions. |

## Inner Types

### StaticLayerJsonLoader

*static class*

Loads static layers with entries, noise masks, and environment.

### DynamicLayerJsonLoader

*static class*

Loads dynamic layers with entries, noise masks, environment, and Y offset noise.

### LayerEntryJsonLoader

*abstract static class*

Base class for layer entry loaders. Loads block arrays and noise masks.

### Constants

*interface*

JSON key constants for all layer-related fields and error messages.

