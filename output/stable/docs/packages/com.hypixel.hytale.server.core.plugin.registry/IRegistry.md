---
title: "IRegistry"
kind: "interface"
package: "com.hypixel.hytale.server.core.plugin.registry"
fqcn: "com.hypixel.hytale.server.core.plugin.registry.IRegistry"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "registry"
  - "plugin"
---

**Package:** `com.hypixel.hytale.server.core.plugin.registry`

```java
public interface IRegistry
```

Base interface for plugin registries. All registry types implement this to provide a common `shutdown` lifecycle hook that is called when the plugin is unloaded.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `shutdown()` | `void` | Called when the registry is shut down during plugin unloading. |
