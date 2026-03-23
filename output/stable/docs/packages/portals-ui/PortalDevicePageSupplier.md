---
title: "PortalDevicePageSupplier"
kind: class
package: "com.hypixel.hytale.builtin.portals.ui"
fqcn: "com.hypixel.hytale.builtin.portals.ui.PortalDevicePageSupplier"
api_surface: "public"
extends: "OpenCustomUIInteraction.CustomPageSupplier"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["portals", "ui"]
---

Supplies the appropriate portal device UI page based on the current state of the portal device block. Implements `OpenCustomUIInteraction.CustomPageSupplier`. Validates block types, block states, and creates either a `PortalDeviceSummonPage` (no active portal) or `PortalDeviceActivePage` (active portal).

## Hierarchy

- **Extends:** `OpenCustomUIInteraction.CustomPageSupplier`

## Methods

| Method | Return Type | Description |
|--------|------------|-------------|
| `tryCreate(Ref<EntityStore>, ComponentAccessor<EntityStore>, PlayerRef, InteractionContext)` | `CustomUIPage` | Determines the portal device state and returns the appropriate UI page. Returns null if the block is misconfigured. |

