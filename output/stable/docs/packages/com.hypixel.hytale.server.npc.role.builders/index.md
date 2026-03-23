---
title: "com.hypixel.hytale.server.npc.role.builders"
package: "com.hypixel.hytale.server.npc.role.builders"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
---

**Package:** `com.hypixel.hytale.server.npc.role.builders`

This package contains builder classes for constructing NPC role definitions from JSON configuration. Builders validate configuration, manage state mappings, and produce `Role` instances.

## Classes

| Type | Description |
|---|---|
| [BuilderRole](BuilderRole.md) | Primary builder for NPC roles |
| [BuilderRoleAbstract](BuilderRoleAbstract.md) | Extends `BuilderRole` to mark a role as non-spawnable (abstract template only) |
| [BuilderRoleVariant](BuilderRoleVariant.md) | Builder for role variants that reference and modify an existing parent role definition |
