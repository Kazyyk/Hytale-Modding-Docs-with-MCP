---
title: "EntityGroup"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.group"
fqcn: "com.hypixel.hytale.server.core.entity.group.EntityGroup"
api_surface: false
extends: null
implements: ["Component"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "group"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.entity.group`

```java
public class EntityGroup implements Component
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Set<Ref<EntityStore>>` | `memberSet` |
| `private final` | `List<Ref<EntityStore>>` | `memberList` |
| `private` | `Ref<EntityStore>` | `leaderRef` |
| `private` | `boolean` | `dissolved` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore,EntityGroup>` | `getComponentType()` |
| `@Nullable public` | `Ref<EntityStore>` | `getLeaderRef()` |
| `public` | `void` | `setLeaderRef(Ref<EntityStore> leaderRef)` |
| `public` | `void` | `add(Ref<EntityStore> reference)` |
| `public` | `void` | `remove(Ref<EntityStore> reference)` |
| `@Nullable public` | `Ref<EntityStore>` | `getFirst()` |
| `@Nonnull public` | `List<Ref<EntityStore>>` | `getMemberList()` |
| `public` | `int` | `size()` |
| `public` | `boolean` | `isDissolved()` |
| `public` | `void` | `setDissolved(boolean dissolved)` |
| `public` | `void` | `clear()` |
| `public` | `boolean` | `isMember(Ref<EntityStore> reference)` |
| `public` | `void` | `forEachMemberExcludingLeader(TriConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T arg)` |
| `public` | `void` | `forEachMemberExcludingSelf(TriConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T arg)` |
| `public` | `void` | `forEachMember(TriConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T arg)` |
| `public` | `void` | `forEachMember(TriConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T arg, Ref<EntityStore> excludeReference)` |
| `public` | `void` | `forEachMemberExcludingLeader(QuadConsumer<Ref<EntityStore>,Ref<EntityStore>,T,V> consumer, Ref<EntityStore> sender, T t, V v)` |
| `public` | `void` | `forEachMemberExcludingSelf(QuadConsumer<Ref<EntityStore>,Ref<EntityStore>,T,V> consumer, Ref<EntityStore> sender, T t, V v)` |
| `public` | `void` | `forEachMember(QuadConsumer<Ref<EntityStore>,Ref<EntityStore>,T,V> consumer, Ref<EntityStore> sender, T t, V v)` |
| `public` | `void` | `forEachMember(QuadConsumer<Ref<EntityStore>,Ref<EntityStore>,T,V> consumer, Ref<EntityStore> sender, T t, V v, Ref<EntityStore> excludeReference)` |
| `public` | `void` | `forEachMemberExcludingLeader(IntTriObjectConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T t, int value)` |
| `public` | `void` | `forEachMemberExcludingSelf(IntTriObjectConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T t, int value)` |
| `public` | `void` | `forEachMember(IntTriObjectConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T t, int value)` |
| `public` | `void` | `forEachMember(IntTriObjectConsumer<Ref<EntityStore>,Ref<EntityStore>,T> consumer, Ref<EntityStore> sender, T t, int value, Ref<EntityStore> excludeReference)` |
| `public` | `void` | `forEachMember(IntBiObjectConsumer<Ref<EntityStore>,T> consumer, T t)` |
| `@Nullable public` | `Ref<EntityStore>` | `testMembers(Predicate<Ref<EntityStore>> predicate, boolean skipLeader)` |
| `@Nonnull @Override public` | `Component<EntityStore>` | `clone()` |
| `@Nonnull @Override public` | `String` | `toString()` |
