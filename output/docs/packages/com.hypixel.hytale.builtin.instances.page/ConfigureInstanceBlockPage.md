---
title: "ConfigureInstanceBlockPage"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.page"
fqcn: "com.hypixel.hytale.builtin.instances.page.ConfigureInstanceBlockPage"
api_surface: false
extends: "InteractiveCustomUIPage<ConfigureInstanceBlockPage.PageData>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "instances"
  - "page"
  - "ui"
  - "block"
---

**Package:** `com.hypixel.hytale.builtin.instances.page`

```java
public class ConfigureInstanceBlockPage extends InteractiveCustomUIPage<ConfigureInstanceBlockPage.PageData>
```

Custom UI page for configuring an instance block (a block that teleports players to game instances). Allows the player to select an instance from a dropdown, configure position offset (X/Y/Z), rotation (pitch/yaw/roll), instance key, personal return point flag, close-on-remove flag, and remove-block-after timer.

Uses the `Pages/ConfigureInstanceBlockPage.ui` template. Changes are written to the `ConfigurableInstanceBlock` component on save and the chunk is marked as needing save.

## Inner Types

### Action

```java
public static enum Action
```

| Constant | Description |
|---|---|
| `Save` | Persist all configuration to the block component. |
| `PositionOffset` | Toggle the position offset fields. |
| `Rotation` | Toggle the rotation fields. |

### PageData

```java
public static class PageData
```

Codec-serialized event data containing all form fields. Decoded via `BuilderCodec` from UI event bindings.
