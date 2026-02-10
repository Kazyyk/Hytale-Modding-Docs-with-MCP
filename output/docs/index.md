---
title: "Hytale API Documentation"
kind: "overview"
api_surface: "public"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - "landing-page"
  - "overview"
---

> Auto-generated from the Hytale server JAR. All documentation is mechanically derived from the game's bytecode — never from external sources.

## Overview

Hytale's server-side modding API allows plugins to extend the game through a Java plugin system. Plugins are Java classes that extend `PluginBase`, with a lifecycle driven by three methods:

1. **`setup()`** — Register commands, events, components, and configuration before the server starts.
2. **`start()`** — Perform initialization that requires a running server.
3. **`shutdown()`** — Clean up resources when the plugin is disabled or the server stops.

All registrations made through `PluginBase` are automatically scoped to the plugin's lifecycle — when the plugin shuts down, its commands, event listeners, ECS components, and other registrations are automatically cleaned up.

## Plugin Systems

### [Events](api/events/index.md)

A dual event system with two parallel hierarchies:

- **Standard Events** — Synchronous and asynchronous events dispatched through `EventBus` using `Consumer`-based listeners. Used for server lifecycle, player connections, chat, and permissions.
- **ECS Events** — Events dispatched through the Entity Component System pipeline using `store.invoke()`. Used for gameplay actions like block breaking, item drops, and crafting.

### [Commands](api/commands/index.md)

A builder-pattern command system with typed arguments, automatic permission generation, tab completion, and subcommand support. Commands are defined by extending `CommandBase` and declaring arguments as fields.

### [ECS (Entity Component System)](api/components/index.md)

An archetype-based ECS with typed stores, component queries, ticking systems, event systems, and command buffers. Two concrete store types: `EntityStore` for game entities and `ChunkStore` for chunk-level data.

### [Registries](api/registries/index.md)

A three-layer registry architecture: generic `Registry` base for lifecycle management, plugin-specific registries for each subsystem, and global backends for actual data storage. All registries share the same pattern of precondition-gated registration with automatic cleanup on plugin shutdown.

### [JSON Schemas](schemas/index.md)

Data-driven content definition through JSON asset files. Block types, items, crafting recipes, and other game content are defined in JSON using a declarative `BuilderCodec` pattern. Plugins can register custom asset types and extend existing ones.

## API Surface

This documentation covers **811 plugin-facing API types** out of 6,873 total types in the server JAR. The remaining 6,062 types are internal implementation details not intended for plugin use.

- [API Reference](api/index.md) — Plugin-facing classes, events, commands, components, and registries.
- [Internal Types](internals/index.md) — Internal types are not documented individually. They are not part of the stable plugin API and may change without notice.

## Build Information

- **JAR Hash:** `sha256:b728b1b83750fadfbacc7ae98bb7ae424d5947114bc13308337e8fd5dab364a8`
- **Generator Version:** 1.0.0
- **Generated:** 2026-02-09
