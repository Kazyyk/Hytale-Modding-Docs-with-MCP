---
title: "WorldMapLoadException"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldmap"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.WorldMapLoadException"
api_surface: false
extends: "Exception"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldmap"
  - "exception"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.worldmap`

```java
public class WorldMapLoadException extends Exception
```

Checked exception thrown when a world map fails to load. Provides a convenience method to extract a combined trace message from the exception chain.

## Constructors

```java
public WorldMapLoadException(@Nonnull String message)
```

```java
public WorldMapLoadException(@Nonnull String message, Throwable cause)
```

## Instance Methods

```java
public String getTraceMessage()
```

Returns a comma-separated combined message from this exception and its cause chain.

```java
public String getTraceMessage(@Nonnull String joiner)
```

Returns combined messages from the exception chain joined by the specified delimiter.
