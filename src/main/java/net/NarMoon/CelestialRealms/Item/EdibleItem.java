package net.NarMoon.CelestialRealms.Item;
import net.NarMoon.CelestialRealms.CelestialRealms;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class EdibleItem extends Item{
    private final FoodProperties foodProperties;

    public EdibleItem(FoodProperties foodProperties) {
        super(new Item.Properties().tab(CelestialRealms.FOOD_TAB).food(foodProperties));
        this.foodProperties = foodProperties;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, net.minecraft.world.level.Level level
            , net.minecraft.world.entity.LivingEntity entity){
        return super.finishUsingItem(stack,level,entity);
    }
}
