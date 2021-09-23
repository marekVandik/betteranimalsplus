package dev.itsmeow.betteranimalsplus.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.Entity;

/**
 * reindeerhead - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelReindeerHead extends EntityModel<Entity> {

    public ModelPart chest;
    public ModelPart neck;
    public ModelPart mane03;
    public ModelPart mane04;
    public ModelPart head;
    public ModelPart mane01;
    public ModelPart mane02;
    public ModelPart lowerJaw;
    public ModelPart lEar;
    public ModelPart rEar;
    public ModelPart lAntler01;
    public ModelPart snout;
    public ModelPart rAntler01;
    public ModelPart lAntler02;
    public ModelPart lAntler14;
    public ModelPart lAntler03;
    public ModelPart lAntler10;
    public ModelPart lAntler04;
    public ModelPart lAntler06;
    public ModelPart lAntler05;
    public ModelPart lAntler08;
    public ModelPart lAntler09;
    public ModelPart lAntler07;
    public ModelPart lAntler11;
    public ModelPart lAntler12;
    public ModelPart lAntler13;
    public ModelPart lAntler15;
    public ModelPart lAntler16;
    public ModelPart rAntler02;
    public ModelPart rAntler14;
    public ModelPart rAntler03;
    public ModelPart rAntler10;
    public ModelPart rAntler04;
    public ModelPart rAntler06;
    public ModelPart rAntler05;
    public ModelPart rAntler08;
    public ModelPart rAntler09;
    public ModelPart rAntler07;
    public ModelPart rAntler11;
    public ModelPart rAntler12;
    public ModelPart rAntler13;
    public ModelPart rAntler15;
    public ModelPart rAntler16;

    public ModelReindeerHead() {
        this.texWidth = 128;
        this.texHeight = 64;
        this.snout = new ModelPart(this, 88, 36);
        this.snout.setPos(0.0F, 3.0F, -2.8F);
        this.snout.addBox(-2.0F, 0.3F, -1.2F, 4, 4, 2, 0.0F);
        this.setRotateAngle(this.snout, 0.2792526803190927F, 0.0F, 0.0F);
        this.rAntler02 = new ModelPart(this, 117, 0);
        this.rAntler02.mirror = true;
        this.rAntler02.setPos(0.0F, 0.3F, -2.1F);
        this.rAntler02.addBox(-0.5F, -6.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(this.rAntler02, 0.6981317007977318F, 0.17453292519943295F, -0.20943951023931953F);
        this.rAntler05 = new ModelPart(this, 117, 0);
        this.rAntler05.mirror = true;
        this.rAntler05.setPos(-0.2F, 0.0F, -4.6F);
        this.rAntler05.addBox(0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(this.rAntler05, 0.0F, 0.6981317007977318F, 0.0F);
        this.lAntler09 = new ModelPart(this, 117, 0);
        this.lAntler09.mirror = true;
        this.lAntler09.setPos(0.0F, -1.8F, 0.0F);
        this.lAntler09.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.lAntler09, 0.0F, 0.0F, -0.3490658503988659F);
        this.lAntler07 = new ModelPart(this, 117, 0);
        this.lAntler07.mirror = true;
        this.lAntler07.setPos(0.0F, -2.8F, 0.0F);
        this.lAntler07.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.lAntler07, 0.0F, 0.0F, -0.3490658503988659F);
        this.rAntler03 = new ModelPart(this, 117, 0);
        this.rAntler03.setPos(0.0F, -5.7F, 0.1F);
        this.rAntler03.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(this.rAntler03, -0.9075712110370513F, -0.22689280275926282F, -0.22689280275926282F);
        this.chest = new ModelPart(this, 0, 0);
        this.chest.setPos(0.0F, 23.9F, 0.0F);
        this.chest.addBox(-3.5F, -3.0F, -5.0F, 7, 6, 5, 0.0F);
        this.mane02 = new ModelPart(this, 20, 50);
        this.mane02.setPos(0.0F, 0.9F, -1.0F);
        this.mane02.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 6, 0.0F);
        this.setRotateAngle(this.mane02, -0.8203047484373349F, 0.0F, 0.0F);
        this.rAntler01 = new ModelPart(this, 117, 0);
        this.rAntler01.mirror = true;
        this.rAntler01.setPos(-1.1F, 1.0F, -3.5F);
        this.rAntler01.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(this.rAntler01, -0.2792526803190927F, 0.4363323129985824F, 0.0F);
        this.lAntler15 = new ModelPart(this, 117, 0);
        this.lAntler15.setPos(0.0F, 2.8F, 0.0F);
        this.lAntler15.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.lAntler15, -0.3141592653589793F, 0.0F, 0.3665191429188092F);
        this.rAntler12 = new ModelPart(this, 117, 0);
        this.rAntler12.setPos(-0.1F, 0.0F, -1.7F);
        this.rAntler12.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(this.rAntler12, -0.3665191429188092F, -0.5235987755982988F, 0.0F);
        this.rEar = new ModelPart(this, 0, 13);
        this.rEar.mirror = true;
        this.rEar.setPos(-1.8F, -1.0F, -3.0F);
        this.rEar.addBox(-1.0F, -0.7F, -3.1F, 2, 1, 3, 0.0F);
        this.setRotateAngle(this.rEar, 0.2617993877991494F, 1.1519173063162573F, 0.3665191429188092F);
        this.lAntler03 = new ModelPart(this, 117, 0);
        this.lAntler03.setPos(0.0F, -5.7F, 0.1F);
        this.lAntler03.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(this.lAntler03, -0.9075712110370513F, 0.22689280275926282F, 0.22689280275926282F);
        this.lAntler12 = new ModelPart(this, 117, 0);
        this.lAntler12.mirror = true;
        this.lAntler12.setPos(0.1F, 0.0F, -1.7F);
        this.lAntler12.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(this.lAntler12, -0.3665191429188092F, 0.5235987755982988F, 0.0F);
        this.rAntler14 = new ModelPart(this, 117, 0);
        this.rAntler14.mirror = true;
        this.rAntler14.setPos(0.0F, 0.4F, -0.3F);
        this.rAntler14.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.rAntler14, -0.19198621771937624F, 0.0F, 0.0F);
        this.rAntler11 = new ModelPart(this, 117, 0);
        this.rAntler11.mirror = true;
        this.rAntler11.setPos(-0.1F, 0.0F, -2.7F);
        this.rAntler11.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(this.rAntler11, 0.0F, -0.5235987755982988F, 0.0F);
        this.lAntler13 = new ModelPart(this, 117, 0);
        this.lAntler13.mirror = true;
        this.lAntler13.setPos(0.1F, 0.2F, -0.7F);
        this.lAntler13.addBox(-0.5F, -0.5F, -3.8F, 1, 1, 4, 0.0F);
        this.setRotateAngle(this.lAntler13, 0.45378560551852565F, 0.3490658503988659F, 0.0F);
        this.lAntler04 = new ModelPart(this, 117, 0);
        this.lAntler04.mirror = true;
        this.lAntler04.setPos(0.0F, -0.1F, -1.6F);
        this.lAntler04.addBox(-0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(this.lAntler04, 0.6981317007977318F, 0.22689280275926282F, 0.0F);
        this.lAntler06 = new ModelPart(this, 117, 0);
        this.lAntler06.mirror = true;
        this.lAntler06.setPos(0.0F, -0.1F, -1.6F);
        this.lAntler06.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.lAntler06, 0.3490658503988659F, 0.22689280275926282F, -0.3141592653589793F);
        this.lAntler02 = new ModelPart(this, 117, 0);
        this.lAntler02.setPos(0.0F, 0.3F, -2.1F);
        this.lAntler02.addBox(-0.5F, -6.0F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(this.lAntler02, 0.6981317007977318F, -0.17453292519943295F, 0.20943951023931953F);
        this.lAntler10 = new ModelPart(this, 117, 0);
        this.lAntler10.mirror = true;
        this.lAntler10.setPos(0.0F, -0.9F, 0.0F);
        this.lAntler10.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(this.lAntler10, 0.4363323129985824F, -0.4363323129985824F, -0.22689280275926282F);
        this.rAntler09 = new ModelPart(this, 117, 0);
        this.rAntler09.setPos(0.0F, -1.8F, 0.0F);
        this.rAntler09.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.rAntler09, 0.0F, 0.0F, 0.3490658503988659F);
        this.rAntler08 = new ModelPart(this, 117, 0);
        this.rAntler08.mirror = true;
        this.rAntler08.setPos(0.0F, -0.1F, -2.5F);
        this.rAntler08.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.rAntler08, 0.593411945678072F, 0.0F, 0.3141592653589793F);
        this.rAntler13 = new ModelPart(this, 117, 0);
        this.rAntler13.setPos(-0.1F, 0.2F, -0.7F);
        this.rAntler13.addBox(-0.5F, -0.5F, -3.8F, 1, 1, 4, 0.0F);
        this.setRotateAngle(this.rAntler13, 0.45378560551852565F, -0.3490658503988659F, 0.0F);
        this.mane03 = new ModelPart(this, 46, 50);
        this.mane03.setPos(0.0F, 2.4F, -3.5F);
        this.mane03.addBox(-3.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F);
        this.setRotateAngle(this.mane03, -1.5707963267948966F, 0.0F, 0.0F);
        this.lAntler01 = new ModelPart(this, 117, 0);
        this.lAntler01.setPos(1.1F, 1.0F, -3.5F);
        this.lAntler01.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(this.lAntler01, -0.2792526803190927F, -0.4363323129985824F, 0.0F);
        this.rAntler10 = new ModelPart(this, 117, 0);
        this.rAntler10.setPos(0.0F, -0.9F, 0.0F);
        this.rAntler10.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(this.rAntler10, 0.4363323129985824F, 0.4363323129985824F, 0.22689280275926282F);
        this.rAntler15 = new ModelPart(this, 117, 0);
        this.rAntler15.mirror = true;
        this.rAntler15.setPos(0.0F, 2.8F, 0.0F);
        this.rAntler15.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.rAntler15, -0.3141592653589793F, 0.0F, -0.3665191429188092F);
        this.rAntler04 = new ModelPart(this, 117, 0);
        this.rAntler04.setPos(0.0F, -0.1F, -1.6F);
        this.rAntler04.addBox(-0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(this.rAntler04, 0.6981317007977318F, -0.22689280275926282F, 0.0F);
        this.rAntler07 = new ModelPart(this, 117, 0);
        this.rAntler07.setPos(0.0F, -2.8F, 0.0F);
        this.rAntler07.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.rAntler07, 0.0F, 0.0F, 0.3490658503988659F);
        this.lAntler11 = new ModelPart(this, 117, 0);
        this.lAntler11.setPos(0.1F, 0.0F, -2.7F);
        this.lAntler11.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(this.lAntler11, 0.0F, 0.5235987755982988F, 0.0F);
        this.lAntler14 = new ModelPart(this, 117, 0);
        this.lAntler14.setPos(0.0F, 0.4F, -0.3F);
        this.lAntler14.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.lAntler14, -0.19198621771937624F, 0.0F, 0.0F);
        this.lEar = new ModelPart(this, 0, 13);
        this.lEar.setPos(1.8F, -1.0F, -3.0F);
        this.lEar.addBox(-1.0F, -0.7F, -3.1F, 2, 1, 3, 0.0F);
        this.setRotateAngle(this.lEar, 0.2617993877991494F, -1.1519173063162573F, -0.3665191429188092F);
        this.mane04 = new ModelPart(this, 72, 50);
        this.mane04.setPos(0.0F, 2.7F, -1.5F);
        this.mane04.addBox(-3.0F, -1.0F, 0.0F, 6, 2, 6, 0.0F);
        this.setRotateAngle(this.mane04, -1.5707963267948966F, 0.0F, 0.0F);
        this.head = new ModelPart(this, 88, 14);
        this.head.setPos(0.0F, 1.1F, -4.0F);
        this.head.addBox(-2.5F, -3.0F, -4.0F, 5, 7, 4, 0.0F);
        this.setRotateAngle(this.head, -0.3490658503988659F, 0.0F, 0.0F);
        this.rAntler16 = new ModelPart(this, 117, 0);
        this.rAntler16.mirror = true;
        this.rAntler16.setPos(0.0F, 2.5F, 0.0F);
        this.rAntler16.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.rAntler16, 0.41887902047863906F, 0.0F, -0.3665191429188092F);
        this.lowerJaw = new ModelPart(this, 102, 28);
        this.lowerJaw.setPos(0.0F, 3.3F, -1.4F);
        this.lowerJaw.addBox(-1.5F, -0.4F, -1.0F, 3, 4, 2, 0.0F);
        this.rAntler06 = new ModelPart(this, 117, 0);
        this.rAntler06.setPos(0.0F, -0.1F, -1.6F);
        this.rAntler06.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.rAntler06, 0.3490658503988659F, -0.22689280275926282F, 0.3141592653589793F);
        this.lAntler08 = new ModelPart(this, 117, 0);
        this.lAntler08.setPos(0.0F, -0.1F, -2.5F);
        this.lAntler08.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.lAntler08, 0.593411945678072F, 0.0F, -0.3141592653589793F);
        this.mane01 = new ModelPart(this, 0, 50);
        this.mane01.setPos(0.0F, 1.4F, -2.9F);
        this.mane01.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
        this.setRotateAngle(this.mane01, -0.7853981633974483F, 0.0F, 0.0F);
        this.lAntler05 = new ModelPart(this, 117, 0);
        this.lAntler05.setPos(0.2F, 0.0F, -4.6F);
        this.lAntler05.addBox(-3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(this.lAntler05, 0.0F, -0.6981317007977318F, 0.0F);
        this.neck = new ModelPart(this, 88, 0);
        this.neck.setPos(0.0F, 0.3F, -4.0F);
        this.neck.addBox(-2.5F, -2.5F, -5.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(this.neck, -0.6373942428283291F, 0.0F, 0.0F);
        this.lAntler16 = new ModelPart(this, 117, 0);
        this.lAntler16.setPos(0.0F, 2.5F, 0.0F);
        this.lAntler16.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.lAntler16, 0.41887902047863906F, 0.0F, 0.3665191429188092F);
        this.head.addChild(this.snout);
        this.rAntler01.addChild(this.rAntler02);
        this.rAntler04.addChild(this.rAntler05);
        this.lAntler08.addChild(this.lAntler09);
        this.lAntler06.addChild(this.lAntler07);
        this.rAntler02.addChild(this.rAntler03);
        this.neck.addChild(this.mane02);
        this.head.addChild(this.rAntler01);
        this.lAntler14.addChild(this.lAntler15);
        this.rAntler11.addChild(this.rAntler12);
        this.head.addChild(this.rEar);
        this.lAntler02.addChild(this.lAntler03);
        this.lAntler11.addChild(this.lAntler12);
        this.rAntler01.addChild(this.rAntler14);
        this.rAntler10.addChild(this.rAntler11);
        this.lAntler11.addChild(this.lAntler13);
        this.lAntler03.addChild(this.lAntler04);
        this.lAntler03.addChild(this.lAntler06);
        this.lAntler01.addChild(this.lAntler02);
        this.lAntler02.addChild(this.lAntler10);
        this.rAntler08.addChild(this.rAntler09);
        this.rAntler04.addChild(this.rAntler08);
        this.rAntler11.addChild(this.rAntler13);
        this.chest.addChild(this.mane03);
        this.head.addChild(this.lAntler01);
        this.rAntler02.addChild(this.rAntler10);
        this.rAntler14.addChild(this.rAntler15);
        this.rAntler03.addChild(this.rAntler04);
        this.rAntler06.addChild(this.rAntler07);
        this.lAntler10.addChild(this.lAntler11);
        this.lAntler01.addChild(this.lAntler14);
        this.head.addChild(this.lEar);
        this.chest.addChild(this.mane04);
        this.neck.addChild(this.head);
        this.rAntler14.addChild(this.rAntler16);
        this.head.addChild(this.lowerJaw);
        this.rAntler03.addChild(this.rAntler06);
        this.lAntler04.addChild(this.lAntler08);
        this.neck.addChild(this.mane01);
        this.lAntler04.addChild(this.lAntler05);
        this.chest.addChild(this.neck);
        this.lAntler14.addChild(this.lAntler16);
    }

    @Override
    public void setupAnim(Entity entity, float f, float f1, float f2, float f3, float f4) {
        this.chest.yRot = (float) Math.toRadians(f);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.chest.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
