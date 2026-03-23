---
title: "PluginState"
kind: "enum"
package: "com.hypixel.hytale.server.core.plugin"
fqcn: "com.hypixel.hytale.server.core.plugin.PluginState"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "plugin"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.plugin`

```java
public enum PluginState
```

Lifecycle states for a plugin.

## Values

| Name | Description |
|---|---|
| `NONE` | Initial state before setup |
| `SETUP` | Plugin is being set up |
| `START` | Plugin is being started |
| `ENABLED` | Plugin is fully running |
| `SHUTDOWN` | Plugin is shutting down |
| `DISABLED` | Plugin has been cleanly disabled |
| `FAILED` | Plugin encountered an error |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `isInactive()` |
