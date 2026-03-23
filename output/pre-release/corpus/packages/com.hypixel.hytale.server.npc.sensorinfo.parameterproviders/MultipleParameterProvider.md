# MultipleParameterProvider

Type: class | Package: com.hypixel.hytale.server.npc.sensorinfo.parameterproviders | Implements: ParameterProvider

public class MultipleParameterProvider implements ParameterProvider

## Fields

- private final Int2ObjectMap<ParameterProvider> providers

## Methods

- @Override public ParameterProvider getParameterProvider(int parameter)
- @Override public void clear()
- public void addParameterProvider(int parameter, ParameterProvider provider)
