---
title: "PlayerRef"
kind: "class"
package: "com.hypixel.hytale.server.core.universe"
fqcn: "com.hypixel.hytale.server.core.universe.PlayerRef"
api_surface: true
extends: ~
implements: 
  - "Component<EntityStore>"
  - "MetricProvider"
  - "IMessageReceiver"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
tags:
  - "universe"
  - "player"
---

**Package:** `com.hypixel.hytale.server.core.universe`

```java
public class PlayerRef implements Component<EntityStore>, MetricProvider, IMessageReceiver
```

Represents a connected player's server-side reference. Acts as the bridge between the network layer (`PacketHandler`), the entity system (`Ref<EntityStore>`), and player-facing features. Tracks UUID, username, language, transform, chunk tracker, hidden players, and metrics.

## Methods

```java
@Nonnull
public static ComponentType<EntityStore, PlayerRef> getComponentType()
```

```java
@Nullable
public Ref<EntityStore> addToStore(@Nonnull Store<EntityStore> store)
```

```java
@Nonnull
public Holder<EntityStore> removeFromStore()
```

```java
public boolean isValid()
```

```java
@Nullable
public Ref<EntityStore> getReference()
```

```java
@Nonnull
public UUID getUuid()
```

```java
@Nonnull
public String getUsername()
```

```java
@Nonnull
public PacketHandler getPacketHandler()
```

```java
@Nonnull
public ChunkTracker getChunkTracker()
```

```java
@Nonnull
public HiddenPlayersManager getHiddenPlayersManager()
```

```java
@Nonnull
public String getLanguage()
```

```java
public void setLanguage(@Nonnull String language)
```

```java
public void referToServer(@Nonnull String host, int port)
```

Sends a referral packet directing the client to connect to another server.

```java
public void referToServer(@Nonnull String host, int port, @Nullable byte[] data)
```

```java
@Override
public void sendMessage(@Nonnull Message message)
```
