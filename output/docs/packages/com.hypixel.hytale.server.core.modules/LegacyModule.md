---
title: "LegacyModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules"
fqcn: "com.hypixel.hytale.server.core.modules.LegacyModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "module"
  - "core"
  - "plugin"
---

**Package:** `com.hypixel.hytale.server.core.modules`

```java
public class LegacyModule extends JavaPlugin
```

Core server plugin that registers all fundamental chunk store component types and their ECS systems. Provides singleton access and component type getters for world chunk, block chunk, entity chunk, block component chunk, environment chunk, chunk column, chunk section, block section, fluid section, and block position provider. Also registers migration systems for legacy data formats.
