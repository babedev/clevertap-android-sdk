package com.clevertap.android.sdk;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

class CTIconMessageViewHolder extends RecyclerView.ViewHolder {

    ImageView readDot, mediaImage,iconImage;
    Button cta1,cta2,cta3;
    TextView title,message,timestamp;

    public CTIconMessageViewHolder(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.messageTitle);
        message = itemView.findViewById(R.id.messageText);
        mediaImage = itemView.findViewById(R.id.media_image);
        iconImage = itemView.findViewById(R.id.image_icon);
        readDot = itemView.findViewById(R.id.read_circle);
        timestamp = itemView.findViewById(R.id.timestamp);
        cta1 = itemView.findViewById(R.id.cta_button_1);
        cta2 = itemView.findViewById(R.id.cta_button_2);
        cta3 = itemView.findViewById(R.id.cta_button_3);
    }
}