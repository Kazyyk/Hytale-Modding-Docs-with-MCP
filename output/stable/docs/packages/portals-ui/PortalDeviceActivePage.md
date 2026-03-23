---
title: "PortalDeviceActivePage"
kind: class
package: "com.hypixel.hytale.builtin.portals.ui"
fqcn: "com.hypixel.hytale.builtin.portals.ui.PortalDeviceActivePage"
api_surface: "public"
extends: "InteractiveCustomUIPage"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["portals", "ui"]
---

UI page displayed when a player interacts with a portal device that already has an active portal. Shows portal type information, player count inside the fragment world, remaining time, and whether the player previously died inside.

## Hierarchy

- **Extends:** `InteractiveCustomUIPage`

## Methods

| Method | Return Type | Description |
|--------|------------|-------------|
| `build(Ref<EntityStore>, UICommandBuilder, UIEventBuilder, Store<EntityStore>)` | `void` | Builds the UI command set for the active portal page. Displays portal title, description, player count, and remaining duration. |
| `computeState(Ref<EntityStore>, ComponentAccessor<EntityStore>)` | `PortalDeviceActivePage.State` | Computes the current state by checking block ref validity, portal device component, destination world, and portal world existence. |
| `createPlayerCountMsg(World)` | `Message` | Creates a localized player count message with pink color formatting. |

## Inner Types

### Data

*class*

Empty codec data class for UI event handling.

### Error

*enum*

Error states: `INVALID_BLOCK`, `INVALID_WORLD`, `DESTINATION_NOT_FRAGMENT`, `INACTIVE_PORTAL`.

### PortalIsOpen

*record*

Record holding the destination `World`, `PortalWorld`, and `diedInside` flag.

### State

*sealed interface*

Sealed interface permitting `PortalIsOpen` and `Error`.

