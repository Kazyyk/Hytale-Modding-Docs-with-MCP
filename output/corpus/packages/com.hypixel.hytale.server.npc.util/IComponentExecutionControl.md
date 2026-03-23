# IComponentExecutionControl

Type: interface | Package: com.hypixel.hytale.server.npc.util

public interface IComponentExecutionControl

Interface for NPC components with execution gating logic. Provides delay processing, one-shot triggering, and triggered-state queries.

## Methods

- boolean processDelay(float var1)
- void clearOnce()
- void setOnce()
- boolean isTriggered()
