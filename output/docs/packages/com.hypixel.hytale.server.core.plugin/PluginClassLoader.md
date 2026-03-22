---
title: "PluginClassLoader"
kind: "class"
package: "com.hypixel.hytale.server.core.plugin"
fqcn: "com.hypixel.hytale.server.core.plugin.PluginClassLoader"
api_surface: true
extends: "URLClassLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "plugin"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.plugin`

```java
public class PluginClassLoader extends URLClassLoader
```

Custom class loader for Java plugins. Implements a delegation chain: server classes first, then the plugin's own JAR, then a bridge loader that searches other loaded plugins. Supports parallel class loading.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `isInServerClassPath()` |
| `@Nonnull public` | `Class<?>` | `loadLocalClass(@Nonnull String name)` |
| `public static` | `boolean` | `isFromThirdPartyPlugin(@Nullable Throwable throwable)` |
