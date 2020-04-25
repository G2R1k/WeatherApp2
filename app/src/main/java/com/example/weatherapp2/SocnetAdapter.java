package com.example.weatherapp2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SocnetAdapter extends RecyclerView.Adapter<SocnetAdapter.ViewHolder>{
    private String[] myDataSource;
    //private OnItemClickListener myItemClickListener;
    // Слушатель будет устанавливаться извне


    // Передаем в конструктор источник данных
    // В нашем случае это массив, но может быть и запросом к БД
    public SocnetAdapter(String[] myDataSource){
        this.myDataSource = myDataSource;
    }

    // Создать новый элемент пользовательского интерфейса
    // Запускается менеджером
    @NonNull
    @Override
    public SocnetAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // Создаем новый элемент пользовательского интерфейса
        // Через Inflater
        View myView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,
                viewGroup,false );
        // Здесь можно установить всякие параметры
        return new ViewHolder(myView);
    }

    // Заменить данные в пользовательском интерфейсе
    // Вызывается менеджером
    @Override
    public void onBindViewHolder(@NonNull SocnetAdapter.ViewHolder holder, int position) {
        // Получить элемент из источника данных (БД, интернет...)
// Вынести на экран используя ViewHolder
        holder.getTextView().setText(myDataSource[position]);
    }

    // Вернуть размер данных, вызывается менеджером
    @Override
    public int getItemCount() {
        return myDataSource.length;
    }

    // Этот класс хранит связь между данными и элементами View
// Сложные данные могут потребовать несколько View на
// один пункт списка
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            textView = (TextView) itemView;
        }

        public TextView getTextView(){
            return textView;
        }
    }
}