package malte0811.ferritecore.ducks;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Table;
import malte0811.ferritecore.fastmap.FastMap;
import net.minecraft.world.level.block.state.properties.Property;

public interface FastMapStateHolder<S> {
    FastMap<S> getStateMap();

    void setStateMap(FastMap<S> newValue);

    int getStateIndex();

    void setStateIndex(int newValue);

    ImmutableMap<Property<?>, Comparable<?>> getVanillaPropertyMap();

    void replacePropertyMap(ImmutableMap<Property<?>, Comparable<?>> newMap);

    void setNeighborTable(Table<Property<?>, Comparable<?>, S> table);

    Table<Property<?>, Comparable<?>, S> getNeighborTable();
}
