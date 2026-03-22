---
title: "StateSupport"
kind: "class"
package: "com.hypixel.hytale.server.npc.role.support"
fqcn: "com.hypixel.hytale.server.npc.role.support.StateSupport"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "role"
  - "state-machine"
---

**Package:** `com.hypixel.hytale.server.npc.role.support`

```java
public class StateSupport
```

Behavior state machine for NPC roles. Manages the primary state/sub-state pair, component-local state machines, busy states, state transitions, and NPC interaction tracking. States are mapped by name to integer indices via `StateMappingHelper`. State changes can trigger transition actions through the `StateTransitionController` and can be propagated to flock members.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `NO_STATE` | `Integer.MIN_VALUE` |

## Constructors

| Signature |
|---|
| `public StateSupport(@Nonnull BuilderRole builder, @Nonnull BuilderSupport support)` |

## State Query Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `inState(int state)` |
| `public` | `boolean` | `inSubState(int subState)` |
| `public` | `boolean` | `inState(int state, int subState)` |
| `public` | `boolean` | `inState(String state, String subState)` |
| `@Nonnull public` | `String` | `getStateName()` |
| `@Nonnull public` | `String` | `getStateName(int state, int subState)` |
| `public` | `int` | `getStateIndex()` |
| `public` | `int` | `getSubStateIndex()` |
| `public` | `void` | `appendStateName(@Nonnull StringBuilder builder)` |

## State Mutation Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `setState(int state, int subState, boolean clearOnce, boolean skipTransition)` |
| `public` | `void` | `setState(@Nonnull Ref<EntityStore> ref, @Nonnull String state, @Nullable String subState, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `setSubState(String subState)` |
| `public` | `void` | `flockSetState(Ref<EntityStore> ref, @Nonnull String state, @Nullable String subState, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `activate()` |

## Component Local State Machines

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `isComponentInState(int componentIndex, int targetState)` |
| `public` | `void` | `setComponentState(int componentIndex, int targetState)` |
| `public` | `void` | `resetLocalStateMachines()` |

## Interaction Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `addContextualInteraction(@Nonnull Ref<EntityStore> playerRef, @Nonnull String context)` |
| `public` | `boolean` | `hasContextualInteraction(@Nonnull Ref<EntityStore> playerReference, @Nonnull String context)` |
| `public` | `void` | `addInteraction(@Nonnull Player player)` |
| `public` | `boolean` | `consumeInteraction(@Nonnull Ref<EntityStore> playerReference)` |
| `public` | `void` | `setInteractable(@Nonnull Ref<EntityStore> entityRef, @Nonnull Ref<EntityStore> playerReference, boolean interactable, @Nullable String hint, boolean showPrompt, @Nonnull Store<EntityStore> store)` |
| `public` | `boolean` | `willInteractWith(@Nonnull Ref<EntityStore> playerReference)` |
| `public` | `boolean` | `isInBusyState()` |

## Transition Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `StateTransitionController` | `getStateTransitionController()` |
| `public` | `boolean` | `runTransitionActions(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)` |
| `public` | `boolean` | `isRunningTransitionActions()` |
