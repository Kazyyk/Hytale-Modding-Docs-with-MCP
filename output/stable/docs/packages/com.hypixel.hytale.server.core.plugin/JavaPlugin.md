---
title: "JavaPlugin"
kind: "class"
package: "com.hypixel.hytale.server.core.plugin"
fqcn: "com.hypixel.hytale.server.core.plugin.JavaPlugin"
api_surface: true
extends: "PluginBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "plugin"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.plugin`

```java
public abstract class JavaPlugin extends PluginBase
```

Base class for Java-based server plugins loaded from JAR files. Extends `PluginBase` with file path and class loader support. Automatically registers the plugin's asset pack during setup if the manifest indicates one.

## Constructors

| Signature |
|---|
| `JavaPlugin(@Nonnull JavaPluginInit init)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Path` | `getFile()` |
| `@Nonnull public` | `PluginClassLoader` | `getClassLoader()` |
| `@Nonnull @Override public final` | `PluginType` | `getType()` |
