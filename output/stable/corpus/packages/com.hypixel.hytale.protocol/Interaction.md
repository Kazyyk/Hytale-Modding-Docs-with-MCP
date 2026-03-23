# Interaction

Type: abstract class | Package: com.hypixel.hytale.protocol

public abstract class Interaction

Abstract polymorphic base class for the interaction/ability system. Uses VarInt type-ID discriminated union with 45 concrete subtypes. Contains common fields for effects, timing, rules, and camera.

## Fields

- WaitForDataFrom waitForDataFrom
- InteractionEffects effects
- float horizontalSpeedMultiplier
- float runTime
- boolean cancelOnItemChange
- Map<`GameMode`, `InteractionSettings`> settings
- InteractionRules rules
- int``[] tags
- InteractionCameraSettings camera

## Serialization Layout

- MAX_SIZE | 1,677,721,605

## Methods

Concrete subtypes are identified by a VarInt type ID prefix during deserialization.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- InteractionEffects
- InteractionRules
- InteractionSettings
- InteractionCameraSettings
- InteractionType
- GameMode
