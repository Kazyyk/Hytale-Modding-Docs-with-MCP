---
title: "Universe"
kind: "class"
package: "com.hypixel.hytale.server.core.universe"
fqcn: "com.hypixel.hytale.server.core.universe.Universe"
api_surface: true
extends: "JavaPlugin"
implements: 
  - "IMessageReceiver"
  - "MetricProvider"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
tags:
  - "universe"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.universe`

```java
public class Universe extends JavaPlugin implements IMessageReceiver, MetricProvider
```

The central singleton managing the server universe. Handles world creation, loading, and removal; player connection lifecycle; player storage; plugin management; and server backup operations. Maintains maps of connected players and loaded worlds.

## Methods

```java
public static Universe get()
```

Returns the singleton instance.

```java
@Nonnull
public ComponentType<EntityStore, PlayerRef> getPlayerRefComponentType()
```

```java
public int getPlayerCount()
```

```java
@Nonnull
public Map<String, World> getWorlds()
```
