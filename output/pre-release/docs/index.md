---
title: "Hydex — Hytale Pre-release Source Documentation"
kind: "overview"
api_surface: true
generator_version: "2.0.0"
generated_at: "2026-03-21T16:49:00Z"
tags:
  - "landing-page"
  - "overview"
---

Comprehensive documentation for the Hytale pre-release source, mechanically
generated from the decompiled Hytale JAR. Every type is
documented with full method signatures, field listings, and cross-references.

## Coverage

| Metric | Count |
|--------|-------|
| Total documented types | 5,838 |
| Java packages | 924 |
| API surface types | 681 |
| Internal types | 5,157 |
| Internal links | 9,612 |

## Organization

Documentation is organized by Java package under `packages/`. Each package
directory contains an `index.md` listing all types in that package, plus
individual type documentation pages.

The `api_surface` frontmatter field indicates whether a type is part of the
plugin-facing API (`true`) or an internal implementation type (`false`). All
types receive full documentation regardless of classification.

The sidebar covers the most important packages grouped by category. All 911
packages are searchable — use the search bar (⌘K) to find any type by name.

## Key Entry Points

### Plugin Development
- [`com.hypixel.hytale.server.core.plugin`](packages/com-hypixel-hytale-server-core-plugin/index.md) — Plugin manager, lifecycle, class loading

### Events
- [`com.hypixel.hytale.event`](packages/com-hypixel-hytale-event/index.md) — Event base interfaces
- [`com.hypixel.hytale.server.core.event.events.player`](packages/com-hypixel-hytale-server-core-event-events-player/index.md) — Player events
- [`com.hypixel.hytale.server.core.event.events.ecs`](packages/com-hypixel-hytale-server-core-event-events-ecs/index.md) — ECS events

### ECS Framework
- [`com.hypixel.hytale.component`](packages/com-hypixel-hytale-component/index.md) — Core ECS: Store, ComponentRegistry, Ref, Archetype

### Commands
- [`com.hypixel.hytale.server.core.command.system`](packages/com-hypixel-hytale-server-core-command-system/index.md) — Command framework

### Entity System
- [`com.hypixel.hytale.server.core.entity`](packages/com-hypixel-hytale-server-core-entity/index.md) — Entity, LivingEntity, interactions
- [`com.hypixel.hytale.server.core.modules.entity.damage`](packages/com-hypixel-hytale-server-core-modules-entity-damage/index.md) — Damage and combat

### World
- [`com.hypixel.hytale.server.core.universe.world`](packages/com-hypixel-hytale-server-core-universe-world/index.md) — World, chunks, block operations
- [`com.hypixel.hytale.server.worldgen`](packages/com-hypixel-hytale-server-worldgen/index.md) — World generation pipeline

### NPC System
- [`com.hypixel.hytale.server.npc.systems`](packages/com-hypixel-hytale-server-npc-systems/index.md) — NPC ECS systems
- [`com.hypixel.hytale.server.npc.role`](packages/com-hypixel-hytale-server-npc-role/index.md) — NPC roles and behavior profiles

### Assets & Codecs
- [`com.hypixel.hytale.assetstore.map`](packages/com-hypixel-hytale-assetstore-map/index.md) — Asset maps and lookup tables
- [`com.hypixel.hytale.codec`](packages/com-hypixel-hytale-codec/index.md) — JSON serialization framework

### Protocol
- [`com.hypixel.hytale.protocol`](packages/com-hypixel-hytale-protocol/index.md) — Network protocol types

### Inventory & Items
- [`com.hypixel.hytale.server.core.inventory`](packages/com-hypixel-hytale-server-core-inventory/index.md) — Inventory system
- [`com.hypixel.hytale.server.core.asset.type.item.config`](packages/com-hypixel-hytale-server-core-asset-type-item-config/index.md) — Item definitions

### JSON Schemas
- [Block Type Schema](schemas/block.md)
- [Item Schema](schemas/item.md)
- [Crafting Recipe Schema](schemas/crafting-recipe.md)
- [NPC Spawn Schema](schemas/npc-spawn.md)

## Source

All documentation is derived from the Hytale JAR. No external sources
are used. If a description says "Purpose unknown," it means the purpose could
not be determined from the decompiled source alone.

## Acknowledgements

Built with [Vineflower](https://github.com/Vineflower/vineflower), [JavaParser](https://javaparser.org/), [Astro Starlight](https://starlight.astro.build/), [Cloudflare Workers](https://workers.cloudflare.com/), [Claude Code](https://claude.com/product/claude-code), and [PAI](https://github.com/danielmiessler/Personal_AI_Infrastructure).

## Build Information

- **Branch:** Pre-release
- **JAR Hash:** `sha256:f38284dbcc322a5a90bc7f63850adbf2489bff8cd8b27b2ac86b8f2cc5c9b7f6`
- **Generator Version:** 2.0.0
- **Generated:** 2026-03-23
